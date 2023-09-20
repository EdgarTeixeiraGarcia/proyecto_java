package com.hackaboss.equipo4.IRepository.Entities;

import com.hackaboss.equipo4.Entity.Entities.RegObj;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegObjRepository extends IBaseRepository<RegObj, Long> {
}