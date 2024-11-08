package org.example.Java_SpringBoot.db;

import java.util.List;

public interface DBREpo {
    List<Person> getPersonData();
    int addPerson(Person person);
}
