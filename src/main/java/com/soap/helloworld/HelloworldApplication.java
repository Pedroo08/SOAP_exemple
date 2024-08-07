package com.soap.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.soap.helloworld.servico.HelloImplement;

import jakarta.xml.ws.Endpoint;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		
		HelloImplement hello = new HelloImplement();
        Endpoint.publish("http://localhost:8085/hello", hello);
        System.out.println("Serviço publicado com sucesso");

	}

}
