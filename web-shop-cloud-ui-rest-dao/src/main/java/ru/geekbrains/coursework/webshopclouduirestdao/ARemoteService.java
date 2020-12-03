package ru.geekbrains.coursework.webshopclouduirestdao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ARemoteService<E> {

    @GetMapping("/getAll")
    List<E> getAll();

    @GetMapping("/getEntityName")
    String getEntityName();

    @GetMapping("/getById/{id}")
    Optional<E> getById(@PathVariable("id") Long id);

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable("id") Long id);

    @PostMapping("save")
    void save(@RequestParam("entity") E entity);

    @PostMapping("/getPage")
    Page<E> getAll(@RequestParam("of") PageRequest of);
}
