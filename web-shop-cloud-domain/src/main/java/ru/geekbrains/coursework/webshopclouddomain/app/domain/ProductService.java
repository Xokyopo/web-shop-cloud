package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ProductRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Product;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

@Service
public class ProductService extends AService<Product, ProductRep, ProductRepository> {
    @Override
    public void save(ProductRep representation) {

    }
}
