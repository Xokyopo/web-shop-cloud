package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

import java.util.Set;

public class ProductRep extends ARepresentation<ProductRep> {
    private Set<CategoryRep> categories;
    private BrandRep brandRep;
    private Set<String> imagesUrls;
    private long price;

    public Set<CategoryRep> getCategories() {
        return this.categories;
    }

    public ProductRep setCategories(Set<CategoryRep> categories) {
        this.categories = categories;
        return this;
    }

    public BrandRep getBrand() {
        return this.brandRep;
    }

    public ProductRep setBrand(BrandRep brandRep) {
        this.brandRep = brandRep;
        return this;
    }

    public Set<String> getImagesUrls() {
        return imagesUrls;
    }

    public ProductRep setImagesUrls(Set<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public ProductRep setPrice(long price) {
        this.price = price;
        return this;
    }
}
