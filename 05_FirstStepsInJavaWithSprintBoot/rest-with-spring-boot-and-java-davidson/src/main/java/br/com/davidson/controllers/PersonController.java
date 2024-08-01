package br.com.davidson.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import br.com.davidson.model.Person;
import br.com.davidson.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired /*Essa anntation faz o papel do new (instancia) comentada abaixo. Ele precisa de um @Service que sejaum alias para @Component*/
	private PersonServices service;
	///private PersonServices service = new PersonServices();
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById (@PathVariable(value = "id") String id) throws Exception { /*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
		
		return service.findById(id);
		
	}
	
	
}
	

