package br.com.davidson.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll(){ /*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
		
		return service.findAll();
		
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById (@PathVariable(value = "id") String id) { /*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
		
		return service.findById(id);
		
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE) /*por meio de "consumes" e "produces", estou dizendo que vamos constumir e produzir json*/
	public Person create (@RequestBody Person person) { /*Essa @RequestBody é utilizada para recuparar dados do corpo da requisição (aba body do postman.*/
		
		return service.create(person);
		
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE) /*por meio de "consumes" e "produces", estou dizendo que vamos constumir e produzir json*/
	public Person update (@RequestBody Person person) { /*Essa @RequestBody é utilizada para recuparar dados do corpo da requisição (aba body do postman.*/
		
		return service.update(person);
		
	}
	
	/*O Spring consegue mapear uma requisição especifica para um método especifico através de um “@RequestMapping”.*/
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	public void delete (@PathVariable(value = "id") String id) { /*Essa pathVariable é utilizada para recuparar dados da URL. Permite que o nosso controller lide com URLs parametrizadas*/
		
		service.delete(id);
		
	}
	
}
	

