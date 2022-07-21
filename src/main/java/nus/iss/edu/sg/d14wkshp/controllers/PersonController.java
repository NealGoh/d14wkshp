package nus.iss.edu.sg.d14wkshp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import nus.iss.edu.sg.d14wkshp.models.Person;
import nus.iss.edu.sg.d14wkshp.services.PersonService;

@Controller
public class PersonController {
    private List<Person> personList = new ArrayList<Person>();

    @Autowired
    PersonService perSvc;

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;
}
