package com.nttdata.bootcamp.pruebasClientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;
import com.nttdata.bootcamp.saludoidioma.domain.Temperatura;

@RestController
public class PruebaController {
	
	@Autowired
	private Saludo saludo;
	
	@Autowired
	private Temperatura temperatura;
	
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
	

	@GetMapping(path="/grados")
	public String pruebaTemperatura(String degrees) {
		return Double.toString(temperatura.convert(degrees));
	}

	
}
