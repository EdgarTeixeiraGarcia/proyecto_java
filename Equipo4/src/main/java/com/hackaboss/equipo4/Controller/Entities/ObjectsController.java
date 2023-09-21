package com.hackaboss.equipo4.Controller.Entities;

import com.hackaboss.equipo4.Controller.Component.BaseController;
import com.hackaboss.equipo4.Entity.Entities.Objects;
import com.hackaboss.equipo4.IService.Entities.IObjectsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Objects")
public class ObjectsController extends BaseController<Objects, IObjectsService> {
    public ObjectsController(IObjectsService service) {
        super(service, "Objects");
    }

}