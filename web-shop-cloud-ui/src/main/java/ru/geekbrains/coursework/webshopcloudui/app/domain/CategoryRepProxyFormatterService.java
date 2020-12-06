package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

@Component
@Scope("application")
public class CategoryRepProxyFormatterService extends AProxyFormatterService<CategoryRep> {
    @Override
    public String convertObjectToString(CategoryRep object) {
        return Long.toString(object.getId());
    }
}
