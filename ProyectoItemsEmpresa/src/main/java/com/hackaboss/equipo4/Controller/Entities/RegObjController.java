package com.hackaboss.equipo4.Controller.Entities;

import com.hackaboss.equipo4.Controller.Component.BaseController;
import com.hackaboss.equipo4.Entity.Entities.RegObj;
import com.hackaboss.equipo4.IService.Entities.IRegObjService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("RegObj")
public class RegObjController extends BaseController<RegObj, IRegObjService> {
    public RegObjController(IRegObjService service) {
        super(service, "RegObj");
    }
}