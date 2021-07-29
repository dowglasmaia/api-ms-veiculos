package org.com.maia.veiculos.services.factory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class CRUDFactoryImpl<T, PK extends Serializable> implements CRUDFactory<T, PK> {
    private static final long serialVersionUID = 1L;

    private final JpaRepository<T, PK> repository;

    public CRUDFactoryImpl(JpaRepository<T, PK> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) throws Exception {
        return repository.save(entity);
    }

    @Override
    public T update(T entity) throws Exception {
        return repository.save(entity);
    }

    @Override
    public void delete(PK id) throws Exception {
        repository.deleteById(id);
    }

    @Override
    public T findById(PK id) {
        return repository.findById(id).orElseThrow(
                ()-> new RuntimeException( "Nenhum recurso foi encontrado para o ID " + id));
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }


}
