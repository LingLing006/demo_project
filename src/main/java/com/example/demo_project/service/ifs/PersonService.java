package com.example.demo_project.service.ifs;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;

@Service
public interface PersonService {
	
	//�����̡A�Ψөw�q��k
	public Person getPersonInfo(String id);
	
	//�b�������A�ߤ@�i�H��@��k���覡 >> �v���]��default
	default Person setPerson(Person p) {
		Person ppp = new Person();
		return p;
	};
}
