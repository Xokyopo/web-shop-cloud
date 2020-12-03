package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.io.Serializable;
import java.util.Objects;

public abstract class ARepresentation implements Serializable {
    private long id;
    private String name;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        } else if (comparedObject != null && this.getClass() == comparedObject.getClass()) {
            ARepresentation aRepresentation = (ARepresentation) comparedObject;
            return this.getId() == aRepresentation.getId() && this.getName().equals(aRepresentation.getName());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.getId(), this.getName());
    }

    public String toString() {
        return "Entity{id=" + this.id + ", name='" + this.name + '\'' + '}';
    }
}
