package com.hackaboss.equipo4.Service.Entities;

import com.hackaboss.equipo4.Entity.Entities.RegObj;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IRepository.Entities.IRegObjRepository;
import com.hackaboss.equipo4.IService.Entities.IRegObjService;
import com.hackaboss.equipo4.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegObjService extends BaseService<RegObj> implements IRegObjService {
    @Override
    protected IBaseRepository<RegObj, Long> getRepository(){
        return repository;
    }
    @Autowired
    private IRegObjRepository repository;
}
