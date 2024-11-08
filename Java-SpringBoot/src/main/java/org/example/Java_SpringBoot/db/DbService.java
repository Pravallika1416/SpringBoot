package org.example.Java_SpringBoot.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    DbRepository dbRepository;

    public List<Person> getPersonData() {
        return dbRepository.getPersonData();
    }

    public int addPersonData(Person person) {
        return dbRepository.addPerson(person);
    }
}
