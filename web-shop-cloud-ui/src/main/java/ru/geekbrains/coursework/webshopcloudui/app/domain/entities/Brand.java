package ru.geekbrains.coursework.webshopcloudui.app.domain.entities;

import java.util.Set;

public class Brand extends AEntity {
    private String logoUrl;
    private Set<Product> products;

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void executePreRemove() {
        this.products.forEach(product -> product.setBrand(null));
    }
}
