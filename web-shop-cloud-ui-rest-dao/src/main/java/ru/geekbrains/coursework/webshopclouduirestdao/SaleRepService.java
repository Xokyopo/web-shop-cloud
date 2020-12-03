package ru.geekbrains.coursework.webshopclouduirestdao;

import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface SaleRepService {
    List<SaleRep> sale(HashMap<ProductRep, Integer> cart);

    List<SaleRep> getAll();

    Optional<ProductRep> getProductBySaleId(long id);
}
