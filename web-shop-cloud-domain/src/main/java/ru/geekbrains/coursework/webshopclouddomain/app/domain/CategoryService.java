package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.CategoryRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Category;

@Service
public class CategoryService extends AService<Category, CategoryRepository> {
}
