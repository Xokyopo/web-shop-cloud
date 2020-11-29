package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.util.Set;

public class ProductRep extends ARepresentation {
    private Set<CategoryRep> categories;
    private BrandRep brandRep;
    private Set<String> imagesUrls;
    private String price;

    public Set<CategoryRep> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryRep> categories) {
        this.categories = categories;
    }

    public BrandRep getBrandRep() {
        return brandRep;
    }

    public void setBrandRep(BrandRep brandRep) {
        this.brandRep = brandRep;
    }

    public Set<String> getImagesUrls() {
        return imagesUrls;
    }

    public void setImagesUrls(Set<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
