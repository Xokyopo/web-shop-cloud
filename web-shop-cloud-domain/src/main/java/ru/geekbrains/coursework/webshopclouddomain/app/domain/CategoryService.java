package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.CategoryRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Category;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

import java.util.Optional;

@Service
public class CategoryService extends AService<Category, CategoryRep, CategoryRepository> {

    @Override
    public void save(CategoryRep representation) {
        Optional<Category> categoryOptional = (representation.getId() != 0) ?
                this.getRepository().findById(representation.getId()) : Optional.of(new Category());

        categoryOptional.ifPresent(category -> {
            category.setName(representation.getName());
            this.getRepository().save(category);
        });
    }
}
