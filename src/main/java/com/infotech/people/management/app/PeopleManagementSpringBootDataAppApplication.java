package com.infotech.people.management.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createPerson();
	//	createPersons();
	//    getPersonByIds();
	//	deletePersonEntity();
//		updatePersonEmailById();
	}

	private void updatePersonEmailById() {
	
		peopleManagementService.updatePersonEmailById(2,"newemailaddress11@gmail.com");
		
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(1);
		peopleManagementService.deletePersonEntity(person);
	}

	private void getPersonByIds() {
		
		List<Integer> ids = new ArrayList<>();
		ids.add(2);
		ids.add(3);
		ids.add(20);
		
		Iterable<Person> personList = peopleManagementService.getPersonByIds(ids);
		personList.forEach(System.out::println);
		
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(
				
				new Person("Jacob", "Hardy", "jh@gmail.com", new Date()),
				new Person("Janice","Lilly","jan@gmai.com",new Date()),
				new Person("rakshi", "pakshi", "rakshi@gmail.com", new Date())
				);
		Iterable<Person> personListDb = peopleManagementService.createPersons(personList);		
		System.out.println(personList);
	}

	private void createPerson() {
		Person p = new Person("Omon", "Yoqubov", "omonjon@gmailcom", new Date());
		Person pDb = peopleManagementService.createPerson(p);
		System.out.println(pDb);
	}

	
	
	
	
	
}
