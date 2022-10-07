package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;
@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setAge(10);
		person.setId(id);
		person.setCity("city");
		person.setName("name");
		return person;
	}

	public String getPersonName(Person person) {
		return person.getName();
	}
	public String getPersonCity(Person person) {
		return person.getCity();
	}
	public String getPersonId(Person person) {
		return person.getId();
	}
	public int getPersonAge(Person person) {
		return person.getAge();
	}
	
	public void printPersonInfo(Person person) {
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getId());
		System.out.println(person.getAge());
	}
}
