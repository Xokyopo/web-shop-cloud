package ru.geekbrains.coursework.webshopclouddomain.app.domain.entities;

import javax.persistence.*;

@Entity(name = "images")
public class Image extends AEntity {
    private String type;
    private String path;
    private long size;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "BLOB")
    private byte[] data;

    public Image() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Image{" +
                "type = '" + type + '\'' +
                ", path = '" + path + '\'' +
                ", size = " + size +
                ", data.length = " + (data == null ? "0" : data.length) +
                "} " + super.toString();
    }
}
