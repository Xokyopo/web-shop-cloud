package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.stereotype.Repository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Product;

@Repository
public interface ProductRepository extends ARepository<Product> {
}
