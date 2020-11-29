package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.io.Serializable;

public class SaleRep implements Serializable {
    private long id;
    private String dateTime;
    private String count;
    private String price;
    private String fullPrice;
    private ProductRep productRep;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(String fullPrice) {
        this.fullPrice = fullPrice;
    }

    public ProductRep getProductRep() {
        return productRep;
    }

    public void setProductRep(ProductRep productRep) {
        this.productRep = productRep;
    }
}
