package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.io.Serializable;

public class SaleRep implements Serializable {
    private long id;
    private String dateTime;
    private long count;
    private long price;
    private ProductRep productRep;

    public long getId() {
        return id;
    }

    public SaleRep setId(long id) {
        this.id = id;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public SaleRep setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public long getCount() {
        return count;
    }

    public SaleRep setCount(long count) {
        this.count = count;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public SaleRep setPrice(long price) {
        this.price = price;
        return this;
    }

    public ProductRep getProduct() {
        return productRep;
    }

    public SaleRep setProduct(ProductRep productRep) {
        this.productRep = productRep;
        return this;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", count=" + count +
                ", price=" + price +
                ", productsAsJSON='" + productRep + '\'' +
                '}';
    }
}
