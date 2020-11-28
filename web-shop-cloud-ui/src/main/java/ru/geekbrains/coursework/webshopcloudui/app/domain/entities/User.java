package ru.geekbrains.coursework.webshopcloudui.app.domain.entities;

import java.util.Set;

public class User extends AEntity {
    private String password;
    private Set<Role> roles;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
