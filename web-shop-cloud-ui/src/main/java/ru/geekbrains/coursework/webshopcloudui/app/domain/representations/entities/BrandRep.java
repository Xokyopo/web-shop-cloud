package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

import java.util.Set;

public class BrandRep extends ARepresentation<BrandRep> {
    private String logoUrl;
    private Set<ProductRep> productReps;

    public String getLogoUrl() {
        return logoUrl;
    }

    public BrandRep setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    public Set<ProductRep> getProducts() {
        return this.productReps;
    }

    public BrandRep setProducts(Set<ProductRep> productReps) {
        this.productReps = productReps;
        return this;
    }

    public void executePreRemove() {
        this.productReps.forEach(product -> product.setBrand(null));
    }
}
