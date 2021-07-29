package org.com.maia.veiculos.services.factory;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

public abstract class CRUDFactoryImpl<T, PK extends Serializable> implements  CRUDFactory<T, PK> {

    @Override
    public T save(T entity) throws Exception {
        return null;
    }

    @Override
    public T update(T entity) throws Exception {
        return null;
    }

    @Override
    public void delete(PK id) throws Exception {

    }

    @Override
    public Optional<T> findById(PK id) {
        return Optional.empty();
    }

    @Override
    public Set<T> findAll() {
        return null;
    }


}
