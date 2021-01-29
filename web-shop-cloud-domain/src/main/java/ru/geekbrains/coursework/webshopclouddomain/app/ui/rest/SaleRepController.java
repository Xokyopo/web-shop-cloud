package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.SaleService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sale")
public class SaleRepController {
    private SaleService service;

    @Autowired
    public SaleRepController(SaleService service) {
        this.service = service;
    }

    @PostMapping("/sale")
    public void sale(@RequestParam("cart") HashMap<ProductRep, Integer> cart) {
        this.service.sale(cart);
    }

    @GetMapping("/getAll")
    public List<SaleRep> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/getProductBySaleId/{id}")
    public Optional<ProductRep> getProductBySaleId(@PathVariable("id") long id) {
        return this.service.getProductBySaleId(id);
    }

}
