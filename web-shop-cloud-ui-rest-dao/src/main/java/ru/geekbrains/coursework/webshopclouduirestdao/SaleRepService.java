package ru.geekbrains.coursework.webshopclouduirestdao;

import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

import java.util.HashMap;
import java.util.Optional;

public interface SaleRepService {
    void sale(HashMap<ProductRep, Integer> cart);

    SaleRep getAll();

    Optional<SaleRep> getProductBySaleId(long id);
}
