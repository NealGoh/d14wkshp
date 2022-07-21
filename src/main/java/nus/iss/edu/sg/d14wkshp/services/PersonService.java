package nus.iss.edu.sg.d14wkshp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import nus.iss.edu.sg.d14wkshp.models.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<Person>();

    public PersonService() {
        persons.add(new Person("Mark", "Zuckerberg"));
        persons.add(new Person("Joe", "Mama"));
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void addPerson(Person p) {
        persons.add(new Person(p.getFirstName(), p.getLastName()));
    }
    
}
