package com.hackaboss.equipo4.Controller.Entities;

import com.hackaboss.equipo4.Controller.Component.BaseController;
import com.hackaboss.equipo4.Entity.Entities.Persons;
import com.hackaboss.equipo4.IService.Entities.IPersonsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Persons")
public class PersonsController extends BaseController<Persons, IPersonsService> {
    public PersonsController(IPersonsService service) {
        super(service, "Persons");
    }
}