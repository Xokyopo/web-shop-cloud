package ru.geekbrains.coursework.webshopcloudui.app.domain.entities;

import java.util.Set;

public class Product extends AEntity {
    private Set<Category> categories;
    private Brand brand;
    private Set<String> imagesUrls;
    private long price;

    public Set<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Set<String> getImagesUrls() {
        return imagesUrls;
    }

    public void setImagesUrls(Set<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
