package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

public class ImageRep extends ARepresentation<ImageRep> {
    private String type;
    private String path;
    private String size;
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

    public String getSize() {
        return size;
    }

    public ImageRep setSize(String size) {
        this.size = size;
        return this;
    }

    @Deprecated
    public byte[] getData() {
        return data;
    }

    @Deprecated
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
