package com.hackaboss.equipo4.Service.Entities;

import com.hackaboss.equipo4.Entity.Entities.Type;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IService.Entities.ITypeService;
import com.hackaboss.equipo4.Service.Component.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.hackaboss.equipo4.IRepository.Entities.ITypeRepository;
import org.springframework.stereotype.Service;


@Service
public class TypeService extends BaseService<Type> implements ITypeService {

    @Autowired
    private ITypeRepository repository;

    @Override
    protected IBaseRepository<Type, Long> getRepository() {
        return repository;
    }

}