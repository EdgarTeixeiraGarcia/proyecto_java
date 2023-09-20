package com.hackaboss.equipo4.IService.Component;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

import java.util.List;

public interface IBaseService <T extends Auditoria> {
    List<T> all();
    List<T> findByStateTrue();
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    void update(Long id, T entity) throws Exception;
 //   void delete(Long id) throws Exception;
}
