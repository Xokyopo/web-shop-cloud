package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ARepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.AService;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;

import java.util.List;
import java.util.Optional;

public abstract class ARemoteServiceController<P, S extends AService<?, P, ? extends ARepository<?>>> implements ARemoteService<P> {
    private S service;

    @Autowired
    public void init(S service) {
        this.service = service;
    }

    @Override
    public List<P> getAll() {
        return this.service.getAll();
    }

    @Override
    public Page<P> getAll(PageRequest of) {
        return this.service.getAll(of);
    }

    @Override
    public String getEntityName() {
        return this.service.getEntityName();
    }

    @Override
    public Optional<P> getById(Long id) {
        return this.service.getById(id);
    }

    @Override
    public void save(P representation) {
        this.service.save(representation);
    }

    @Override
    public void delete(Long id) {
        this.service.delete(id);
    }

    public S getService() {
        return service;
    }
}
