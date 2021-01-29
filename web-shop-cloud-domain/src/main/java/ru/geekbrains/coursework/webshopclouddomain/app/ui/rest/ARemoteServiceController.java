package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ARepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.AService;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.MyPage;

import java.util.List;
import java.util.Optional;

public abstract class ARemoteServiceController<P, S extends AService<?, P, ? extends ARepository<?>>> implements ARemoteService<P> {
    private S service;

    @Autowired
    public void init(S service) {
        this.service = service;
    }

    @Override
    @GetMapping("/getAll")
    public List<P> getAll() {
        return this.service.getAll();
    }

    @Override
    @PostMapping("/getPage")
    public MyPage<P> getPage(@RequestParam("page") int page, @RequestParam("size") int size) {
        return this.service.getAll(PageRequest.of(page, size));
    }

    @Override
    @GetMapping("/getById/{id}")
    public Optional<P> getById(@PathVariable("id") Long id) {
        return this.service.getById(id);
    }

    @Override
    @PostMapping("/save")
    public void save(@RequestParam("representation") P representation) {
        this.service.save(representation);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.service.delete(id);
    }

    protected S getService() {
        return service;
    }
}
