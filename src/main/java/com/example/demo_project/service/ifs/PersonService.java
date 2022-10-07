package com.example.demo_project.service.ifs;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;

@Service
public interface PersonService {
	
	//介面裡，用來定義方法
	public Person getPersonInfo(String id);
	
	//在介面中，唯一可以實作方法的方式 >> 權限設為default
	default Person setPerson(Person p) {
		Person ppp = new Person();
		return p;
	};
}
