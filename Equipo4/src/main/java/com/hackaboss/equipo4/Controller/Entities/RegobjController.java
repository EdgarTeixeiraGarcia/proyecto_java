package com.hackaboss.equipo4.Controller.Entities;

import com.hackaboss.equipo4.Controller.Component.BaseController;
import com.hackaboss.equipo4.Entity.Entities.Regobj;
import com.hackaboss.equipo4.IService.Entities.IRegobjService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("RegObj")
public class RegobjController extends BaseController<Regobj, IRegobjService> {
    public RegobjController(IRegobjService service) {
        super(service, "RegObj");
    }
}