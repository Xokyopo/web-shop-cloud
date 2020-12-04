package ru.geekbrains.coursework.webshopclouduirestdao;

import org.springframework.web.bind.annotation.*;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.MyPage;

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

    @PostMapping("/save")
    void save(@RequestParam("entity") E entity);

    @PostMapping("/getPage")
    MyPage<E> getPage(@RequestParam("page") int page, @RequestParam("size") int size, @RequestParam("sort") String sort);
}
