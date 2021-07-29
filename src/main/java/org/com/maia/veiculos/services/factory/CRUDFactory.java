package org.com.maia.veiculos.services.factory;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

public interface CRUDFactory<T, PK extends Serializable> {

    @Transactional
    T save(T entity) throws Exception;

    @Transactional
    T update(T entity) throws Exception;

    @Transactional
    void delete(PK id) throws Exception;

    @Transactional(readOnly = true)
    Optional<T> findById(PK id);

    @Transactional(readOnly = true)
    Set<T> findAll();


}
