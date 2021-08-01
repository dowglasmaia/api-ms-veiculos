package org.com.maia.veiculos.services.factory;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public interface CRUDFactory<T, PK extends Serializable> {

    @Transactional
    T save(T entity) ;

    @Transactional
    T update(T entity);

    @Transactional
    void delete(PK id);

    @Transactional(readOnly = true)
    T findById(PK id);

    @Transactional(readOnly = true)
    List<T> findAll();


}
