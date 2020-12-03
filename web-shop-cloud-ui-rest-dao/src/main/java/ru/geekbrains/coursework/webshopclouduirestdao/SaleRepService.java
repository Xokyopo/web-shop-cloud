package ru.geekbrains.coursework.webshopclouduirestdao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface SaleRepService {
    @PostMapping("/sale")
    void sale(@RequestParam("cart") HashMap<ProductRep, Integer> cart);

    @GetMapping("/getAll")
    List<SaleRep> getAll();

    @GetMapping("/getProductBySaleId/{id}")
    Optional<ProductRep> getProductBySaleId(@PathVariable("id") long id);
}
