package ru.geekbrains.coursework.webshopcloudui.app.domain;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Sale;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Product;

import java.util.HashMap;
import java.util.Optional;

public interface ASaleService {
    void sale(HashMap<Product, Integer> cart);

    Sale getAll();

    Optional<Sale> getProductBySaleId(long id);
}
