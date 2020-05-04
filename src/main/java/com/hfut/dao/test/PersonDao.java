package com.hfut.dao.test;

import com.hfut.entity.test.Person;

public interface PersonDao {
    public Person querypersonbyid(int id);
    public void insertperson(Person person);

}
