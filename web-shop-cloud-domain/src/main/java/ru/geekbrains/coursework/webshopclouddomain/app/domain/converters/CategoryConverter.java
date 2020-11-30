package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Category;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

@Component
public class CategoryConverter extends AConverterIml<Category, CategoryRep> {

    @Override
    public CategoryRep toRepresentation(Category entity) {
        CategoryRep result = new CategoryRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        return result;
    }
}
