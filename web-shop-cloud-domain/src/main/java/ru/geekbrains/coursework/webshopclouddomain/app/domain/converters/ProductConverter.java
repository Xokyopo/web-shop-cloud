package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Brand;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Category;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Product;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

@Component
public class ProductConverter extends AConverterIml<Product, ProductRep> {
    private AConverterIml<Brand, BrandRep> brandConverter;
    private AConverterIml<Category, CategoryRep> categoryConverter;

    @Autowired
    public ProductConverter(AConverterIml<Brand, BrandRep> brandConverter, AConverterIml<Category, CategoryRep> categoryConverter) {
        this.brandConverter = brandConverter;
        this.categoryConverter = categoryConverter;
    }

    @Override
    public ProductRep toRepresentation(Product entity) {
        ProductRep result = new ProductRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setPrice("" + entity.getPrice());
        result.setImagesUrls(entity.getImagesUrls());
        result.setBrand(brandConverter.toRepresentation(entity.getBrand()));
        result.setCategories(categoryConverter.toRepresentations(entity.getCategories()));
        return null;
    }
}
