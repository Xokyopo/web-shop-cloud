package ru.geekbrains.coursework.webshopcloudui.app.domain;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Sale;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.ProductRep;

import java.util.HashMap;
import java.util.Optional;

public interface SaleRepService {
    void sale(HashMap<ProductRep, Integer> cart);

    Sale getAll();

    Optional<Sale> getProductBySaleId(long id);
}
