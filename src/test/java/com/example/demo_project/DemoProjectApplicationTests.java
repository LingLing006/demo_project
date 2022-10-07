package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.ifs.PersonService;
import com.example.demo_project.service.impl.PersonServiceImpl;

@SpringBootTest
class DemoProjectApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private Active active;
	
	@Test //測試方法
	void contextLoads() {
		Person per = personService.getPersonInfo("aaa");
		
	}
	
	@Test
	public void personTest() {
		PersonServiceImpl psi = new PersonServiceImpl();
		psi.printPersonInfo(psi.getPersonInfo("我的id"));
	}
	
	@Test //一定要加
	public void activeTest() {
//		ActiveImpl act = new  ActiveImpl();
//		act.printflyInfo(act.fly("大笨鳥", 30));
//		Bird bird = active.fly("鳥", 30);
		active.printflyInfo(active.fly("鳥", 30));
		
	}
	

}
