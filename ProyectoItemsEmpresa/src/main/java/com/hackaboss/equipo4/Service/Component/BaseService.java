package com.hackaboss.equipo4.Service.Component;

import com.hackaboss.equipo4.Entity.Component.Auditoria;
import com.hackaboss.equipo4.IRepository.Component.IBaseRepository;
import com.hackaboss.equipo4.IService.Component.IBaseService;
import org.springframework.beans.BeanUtils;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<T extends Auditoria> implements IBaseService<T> {
    protected abstract IBaseRepository<T, Long> getRepository();
    @Override
    public List<T> all() { return getRepository().findAll();}
    @Override
    public List<T> findByStateTrue() { return getRepository().findAll();}

    @Override
    public T findById(Long id) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("No se han encontrado registros");
        }

        return op.get();
    }

    @Override
    public T save(T entity) throws Exception{
        entity.setCreateDate(LocalDateTime.now());
        return getRepository().save(entity);
    }

    @Override
    public void update(Long id, T entity) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("No se han encontrado registros");
        }

        T entityUpdate = op.get();

        String[] ignoreProperties = {"id"};
        BeanUtils.copyProperties(entity, entityUpdate,ignoreProperties);
        entityUpdate.setModDate(LocalDateTime.now());
        getRepository().save(entityUpdate);
    }
}
