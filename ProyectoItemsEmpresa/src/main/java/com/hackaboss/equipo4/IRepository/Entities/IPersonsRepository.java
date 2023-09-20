package com.hackaboss.equipo4.IRepository.Entities;

import com.hackaboss.equipo4.Entity.Entities.Persons;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonsRepository extends IBaseRepository<Persons, Long> {
}