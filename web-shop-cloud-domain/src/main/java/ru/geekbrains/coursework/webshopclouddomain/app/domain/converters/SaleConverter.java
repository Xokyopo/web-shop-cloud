package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Product;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Sale;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.SaleRep;

@Component
public class SaleConverter extends AConverterIml<Sale, SaleRep> {
    private AConverterIml<Product, ProductRep> productAConverter;

    @Autowired
    public SaleConverter(AConverterIml<Product, ProductRep> productAConverter) {
        this.productAConverter = productAConverter;
    }

    @Override
    public SaleRep toRepresentation(Sale entity) {
        //TODO SaleConverter not realization
        SaleRep result = new SaleRep();
        result.setId(entity.getId());
        result.setPrice("" + entity.getPrice());
        result.setCount("" + entity.getCount());
        result.setDateTime(entity.getDateTimeAsString());
        result.setFullPrice("" + (entity.getPrice() * entity.getCount()));
        return result;
    }
}
