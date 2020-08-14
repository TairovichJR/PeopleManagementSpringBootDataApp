package com.infotech.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.dao.PeopleManagementDao;
import com.infotech.people.management.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public Person createPerson(Person p) {
		return peopleManagementDao.save(p);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		
		return peopleManagementDao.saveAll(personList);
	}

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		Iterable<Person> foundPersons = peopleManagementDao.findAll();
		return foundPersons;
	}

	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);
		
	}

	public Person updatePersonEmailById(int id, String newEmail) {
		
		Person person = peopleManagementDao.findById(id).get();
		if(person.getId() == id) {
			person.setEmail(newEmail);
		}
		return peopleManagementDao.save(person);

	}
	
	
	
	
}
