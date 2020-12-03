package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@FeignClient(value = "sale-service", url = "http://localhost:9090/sale")
public interface SaleRepConnector {

    @PostMapping("/sale")
    void sale(@RequestParam("cart") HashMap<ProductRep, Integer> cart);

    @GetMapping("/getAll")
    List<SaleRep> getAll();

    @GetMapping("/getProductBySaleId/{id}")
    Optional<ProductRep> getProductBySaleId(@PathVariable("id") long id);
}
