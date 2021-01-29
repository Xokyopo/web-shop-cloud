package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ARepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.converters.AConverterIml;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Sale;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SaleService {
    private ARepository<Sale> repository;
    private AConverterIml<Sale, SaleRep> saleAConverter;

    @Autowired
    public SaleService(ARepository<Sale> repository, AConverterIml<Sale, SaleRep> saleAConverter) {
        this.repository = repository;
        this.saleAConverter = saleAConverter;
    }

    public void sale(HashMap<ProductRep, Integer> cart) {
//        add to db
        throw new UnsupportedOperationException();
    }

    public List<SaleRep> getAll() {
        return this.repository.findAll().stream().map(this.saleAConverter::toRepresentation).collect(Collectors.toList());
    }

    public Optional<ProductRep> getProductBySaleId(long id) {
//
        throw new UnsupportedOperationException();
    }
}
