package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

public class ImageRep extends ARepresentation<ImageRep> {
    private String type;
    private String path;
    private long size;
    private byte[] data;

    public String getType() {
        return type;
    }

    public ImageRep setType(String type) {
        this.type = type;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ImageRep setPath(String path) {
        this.path = path;
        return this;
    }

    public long getSize() {
        return size;
    }

    public ImageRep setSize(long size) {
        this.size = size;
        return this;
    }

    public byte[] getData() {
        return data;
    }

    public ImageRep setData(byte[] data) {
        this.data = data;
        return this;
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
