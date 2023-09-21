package com.hackaboss.equipo4.Service.Entities;

import com.hackaboss.equipo4.Entity.Entities.Regobj;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IRepository.Entities.IRegobjRepository;
import com.hackaboss.equipo4.IService.Entities.IRegobjService;
import com.hackaboss.equipo4.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegobjService extends BaseService<Regobj> implements IRegobjService {
    @Override
    protected IBaseRepository<Regobj, Long> getRepository(){
        return repository;
    }
    @Autowired
    private IRegobjRepository repository;
}
