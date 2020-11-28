package ru.geekbrains.coursework.webshopcloudui.app.domain;

import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Product;

import java.util.HashMap;

public interface ASaleService {
    void sale(HashMap<Product, Integer> cart);
}
