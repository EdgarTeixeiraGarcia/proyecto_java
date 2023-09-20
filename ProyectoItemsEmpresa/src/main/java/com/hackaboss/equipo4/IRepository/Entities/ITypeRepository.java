package com.hackaboss.equipo4.IRepository.Entities;

import com.hackaboss.equipo4.Entity.Entities.Type;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeRepository extends IBaseRepository<Type, Long> {
}