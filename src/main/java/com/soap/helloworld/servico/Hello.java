package com.soap.helloworld.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface(SEI)
@WebService // Indica que é uma interface serviços
@SOAPBinding (style = Style.RPC) // indica que vamos trabalhar com dados simples tipo String, int etc.
public interface Hello {
	
	
	
	@WebMethod //indica que são operações de serviços
	public String hello ();
	@WebMethod
	public int CalcularIdade(int ano);
	@WebMethod
	public String  dataHoje ();

}
