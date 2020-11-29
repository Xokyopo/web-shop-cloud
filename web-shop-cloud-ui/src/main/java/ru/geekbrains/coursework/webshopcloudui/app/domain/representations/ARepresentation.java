package ru.geekbrains.coursework.webshopcloudui.app.domain.representations;

import java.io.Serializable;
import java.util.Objects;

public abstract class ARepresentation<E> implements Serializable {
    private long id;
    private String name;

    public long getId() {
        return this.id;
    }

    public E setId(long id) {
        this.id = id;
        return (E)this;
    }

    public String getName() {
        return this.name;
    }

    public E setName(String name) {
        this.name = name;
        return (E)this;
    }

    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        } else if (comparedObject != null && this.getClass() == comparedObject.getClass()) {
            ARepresentation<E> aRepresentation = (ARepresentation<E>) comparedObject;
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
