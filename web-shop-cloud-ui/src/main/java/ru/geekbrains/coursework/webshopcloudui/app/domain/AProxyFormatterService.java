package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.MyPage;

import java.text.ParseException;
import java.util.*;

public abstract class AProxyFormatterService<E> implements Formatter<E>, ARemoteService<E> {
    private final Map<String, E> objectsCech = new HashMap<>();
    private ARemoteService<E> connector;

    @Autowired
    public void init(ARemoteService<E> connector) {
        this.connector = connector;
    }

    public abstract String convertObjectToString(E object);

    @Override
    public final E parse(String s, Locale locale) throws ParseException {
        return this.objectsCech.get(s);
    }

    @Override
    public final String print(E e, Locale locale) {
        String result = convertObjectToString(e);
        this.objectsCech.put(result, e);
        return result;
    }

    @Override
    public List<E> getAll() {
        List<E> result = this.connector.getAll();
        result.forEach(entity -> {
            this.print(entity, null);
        });
        return result;
    }

    @Override
    public String getEntityName() {
        return this.connector.getEntityName();
    }

    @Override
    public Optional<E> getById(Long id) {
        return this.connector.getById(id);
    }

    @Override
    public void delete(Long id) {
        this.connector.delete(id);
    }

    @Override
    public void save(E entity) {
        this.save(entity);
    }

    @Override
    public MyPage<E> getPage(int page, int size) {
        return this.connector.getPage(page, size);
    }
}
