package br.com.davidson.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.davidson.model.Person;


@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
		
		logger.info("Finding one person!");
		
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Davidson");
		person.setLastName("Gomes");
		person.setAddress("Betim - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}
	
	/*Moque é uma estrutura de codigo, normalmente temporaria que sustenta o desenvolvimento do codigo até outros
	 * Componentes estjam prontos. A medida em que o projeto vai evoluindo eles vão sendo removidos.
	 * Podem existir moques permantes usados em testes automatizados*/
	
}
