package com.hackaboss.equipo4.Service.Entities;

import com.hackaboss.equipo4.Entity.Entities.Persons;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IRepository.Entities.IPersonsRepository;
import com.hackaboss.equipo4.IService.Entities.IPersonsService;
import com.hackaboss.equipo4.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonsService extends BaseService<Persons> implements IPersonsService {

    @Autowired
    private IPersonsRepository repository;
    @Override
    protected IBaseRepository<Persons, Long> getRepository() {
        return repository;
    }
}