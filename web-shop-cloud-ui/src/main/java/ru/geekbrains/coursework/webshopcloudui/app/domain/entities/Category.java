package ru.geekbrains.coursework.webshopcloudui.app.domain.entities;

import java.util.Set;

public class Category extends AEntity {
    private Set<Product> products;

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

}
