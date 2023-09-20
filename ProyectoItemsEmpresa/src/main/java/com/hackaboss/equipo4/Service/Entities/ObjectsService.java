package com.hackaboss.equipo4.Service.Entities;


import com.hackaboss.equipo4.Entity.Entities.Objects;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IRepository.Entities.IObjectsRepository;
import com.hackaboss.equipo4.IService.Entities.IObjectsService;
import com.hackaboss.equipo4.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectsService extends BaseService<Objects> implements IObjectsService {

    @Autowired
    private IObjectsRepository repository;

    @Override
    protected IBaseRepository<Objects, Long> getRepository() {
        return repository;
    }

}