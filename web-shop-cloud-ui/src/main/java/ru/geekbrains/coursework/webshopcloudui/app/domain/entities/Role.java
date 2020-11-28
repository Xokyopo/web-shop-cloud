package ru.geekbrains.coursework.webshopcloudui.app.domain.entities;

import java.util.Set;

public class Role extends AEntity {
    private String description;
    private Set<User> users;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
