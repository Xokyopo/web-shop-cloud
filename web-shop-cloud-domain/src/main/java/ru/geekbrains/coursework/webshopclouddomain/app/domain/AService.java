package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ARepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.converters.AConverter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AService<E, P, R extends ARepository<E>> {
    private Class<E> entitiesClass;
    private AConverter<E, P> converter;
    private R repository;

    @Autowired
    public void init(R repository, AConverter<E, P> converter) {
        this.repository = repository;
        this.entitiesClass = this.getEntitiesClassBy(repository);
    }

    public List<P> getAll() {
        return this.repository.findAll().stream().map(this.converter::toRepresentation).collect(Collectors.toList());
    }

    public Page<P> getAll(Pageable pageable) {
        this.requireNotNull(pageable, "pageable cant be NULL");

        return this.repository.findAll(pageable).map(this.converter::toRepresentation);
    }

    public Optional<P> getById(Long id) {
        this.requireNotNull(id, "EntityID Cant be NULL");

        return ((id == 0) ? Optional.of(this.getEmptyEntity()) : this.repository.findById(id)).map(this.converter::toRepresentation);
    }

    public void delete(Long id) {
        this.requireNotNull(id, "Entity Cant be NULL");

        this.repository.deleteById(id);
    }

    public R getRepository() {
        return repository;
    }

    public AConverter<E, P> getConverter() {
        return converter;
    }

    public String getEntityName() {
        return this.entitiesClass.getSimpleName();
    }

    protected void requireNotNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    @SuppressWarnings("unchecked")
    private Class<E> getEntitiesClassBy(R repository) {
        ResolvableType resolvableType = ResolvableType.forClass(repository.getClass()).as(JpaRepository.class);
        return (Class<E>) resolvableType.getGeneric(0).toClass();
    }

    protected final E getEmptyEntity() {
        try {
            return this.entitiesClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void save(P representation);
}
