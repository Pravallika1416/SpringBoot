package org.example.Java_SpringBoot.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public interface DBREpo {
    List<Person> getPersonData();
    int addPerson(Person person);
}
