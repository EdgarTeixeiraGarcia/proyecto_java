package com.hackaboss.equipo4.IRepository.Component;

import com.hackaboss.equipo4.Entity.Component.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//@Repository
//@NoRepositoryBean
public interface IBaseRepository <T extends Auditoria, ID> extends JpaRepository<T, ID> {
    //List<T> findByStateTrue();
}