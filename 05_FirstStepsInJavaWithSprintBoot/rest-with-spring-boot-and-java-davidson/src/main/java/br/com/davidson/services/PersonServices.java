package br.com.davidson.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.davidson.model.Person;


@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List <Person> findAll() {
		
		logger.info("Finding all people!");
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i <8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
		
	}

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
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return person;
	}
	
	public Person update(Person person) {
		logger.info("updating one person!");
		return person;
	}
	
	public void delete(String id) {
		logger.info("Deleting one person!");
	}
	
	private Person mockPerson(int i) {
		
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some addres in Brasil " + i);
		person.setGender("Male");
		return person;
	
	}
	
	/*Moque é uma estrutura de codigo, normalmente temporaria que sustenta o desenvolvimento do codigo até outros
	 * Componentes estjam prontos. A medida em que o projeto vai evoluindo eles vão sendo removidos.
	 * Podem existir moques permantes usados em testes automatizados*/
	
}
