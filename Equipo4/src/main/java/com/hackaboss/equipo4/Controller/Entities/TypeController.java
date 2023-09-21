package com.hackaboss.equipo4.Controller.Entities;

import com.hackaboss.equipo4.Controller.Component.BaseController;
import com.hackaboss.equipo4.Entity.Entities.Type;
import com.hackaboss.equipo4.IService.Entities.ITypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Type")
public class TypeController extends BaseController<Type, ITypeService> {
    public TypeController(ITypeService service) {
        super(service, "Type");
    }
}