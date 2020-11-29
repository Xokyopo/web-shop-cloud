package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

import java.util.Set;

public class CategoryRep extends ARepresentation<CategoryRep> {
    private Set<ProductRep> productReps;

    @Deprecated
    public Set<ProductRep> getProducts() {
        return this.productReps;
    }

    @Deprecated
    public CategoryRep setProducts(Set<ProductRep> productReps) {
        this.productReps = productReps;
        return this;
    }

}
