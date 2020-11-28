package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface AService<E> {

    List<E> getAll();

    String getEntityName();

    Optional<E> getById(Long id);

    void delete(Long id);

    void save(E entity);

    Page<E> getAll(PageRequest of);
}
