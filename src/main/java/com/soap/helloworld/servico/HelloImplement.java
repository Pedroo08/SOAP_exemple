package com.soap.helloworld.servico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import jakarta.jws.WebService;


@WebService(endpointInterface ="com.soap.helloworld.servico.Hello")
public class HelloImplement implements Hello{

	@Override
	public String hello() {
		return "Hello World";
	}

	@Override
	public int CalcularIdade(int ano) {
		return 2024 - ano;
	}

	@Override
	public String dataHoje() {
	    LocalDate hoje = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    return hoje.format(formatter);
	}
	
	

}
