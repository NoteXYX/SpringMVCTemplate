package com.hfut.action.test;

import com.hfut.entity.test.Person;
import com.hfut.service.test.PersonService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class PersonAction {
    @Autowired
    PersonService personService;

    @Test
    public void testPerson(){
        ApplicationContext applcition = new ClassPathXmlApplicationContext("application-context.xml");
        PersonAction personAction = (PersonAction) applcition.getBean("personAction");
//		Person person = personAction.personService.querypersonbyid(8);
        Person person = new Person();
        person.setName("小谢");
        person.setAddress("上海");
        person.setAge(15);
        person.setBirthday("05-04");
        personAction.personService.insertperson(person);
        System.out.println(person);
    }
}
