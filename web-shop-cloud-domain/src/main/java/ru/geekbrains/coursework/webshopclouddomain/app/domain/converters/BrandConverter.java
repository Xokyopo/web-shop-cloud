package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Brand;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

@Component
public class BrandConverter extends AConverterIml<Brand, BrandRep> {

    @Override
    public BrandRep toRepresentation(Brand entity) {
        BrandRep result = new BrandRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setLogoUrl(entity.getLogoUrl());
        return result;
    }
}
