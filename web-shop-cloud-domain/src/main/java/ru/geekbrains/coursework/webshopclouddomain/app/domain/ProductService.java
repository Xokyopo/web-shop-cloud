package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ProductRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Product;

@Service
public class ProductService extends AService<Product, ProductRepository> {
}
