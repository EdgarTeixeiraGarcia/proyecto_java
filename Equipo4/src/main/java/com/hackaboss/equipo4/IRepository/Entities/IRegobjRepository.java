package com.hackaboss.equipo4.IRepository.Entities;

import com.hackaboss.equipo4.Entity.Entities.Regobj;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegobjRepository extends IBaseRepository<Regobj, Long> {
}