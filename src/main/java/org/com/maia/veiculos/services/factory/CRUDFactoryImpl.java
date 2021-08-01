package org.com.maia.veiculos.services.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import springfox.documentation.spring.web.json.Json;

import java.io.Serializable;
import java.util.List;

@Slf4j
public abstract class CRUDFactoryImpl<T, PK extends Serializable> implements CRUDFactory<T, PK> {
    private static final long serialVersionUID = 1L;

    private final JpaRepository<T, PK> repository;

    public CRUDFactoryImpl(JpaRepository<T, PK> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        try {
            return repository.save(entity);
        } catch (Exception ex) {
            log.error("Ocorreu uma flaha ao tentar o Salvar o Recurso", ex.getCause());
            throw new RuntimeException("Ocorreu uma flaha ao tentar o Salvar o Recurso, " + new Json(entity.toString()));
        }
    }

    @Override
    public T update(T entity) {
        try {
            return repository.save(entity);
        } catch (Exception ex) {
            log.error("Ocorreu uma flaha ao tentar o Atualizar o Recurso,", ex.getCause());
            throw new RuntimeException("Ocorreu uma flaha ao tentar o Atualizar o Recurso, " + new Json(entity.toString()));
        }
    }

    @Override
    public void delete(PK id) {
        try{
        repository.deleteById(id);
    } catch (Exception ex) {
            log.error("Ocorreu uma flaha ao tentar o Deletar o Recurso de ID " + id, ex.getCause());
        throw new RuntimeException("Ocorreu uma flaha ao tentar o Deletar o Recurso de ID " + id);
    }
    }

    @Override
    public T findById(PK id) {
        return repository.findById(id).orElseThrow(
                () ->  new RuntimeException("Nenhum recurso foi encontrado para o ID " + id));
    }

    @Override
    public List<T> findAll() {
        try{
        return repository.findAll();
    } catch (Exception ex) {
            log.error("Ocorreu uma flaha ao tentar o Obter os Recursos Solicitados", ex.getCause());
        throw new RuntimeException("Ocorreu uma flaha ao tentar o Obter os Recursos Solicitados ");
    }
    }


}
