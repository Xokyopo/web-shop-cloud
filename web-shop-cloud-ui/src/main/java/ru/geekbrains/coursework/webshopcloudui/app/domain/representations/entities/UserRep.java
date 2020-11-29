package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

import java.util.Set;

public class UserRep extends ARepresentation<UserRep> {
    private String password;
    private Set<RoleRep> roleReps;

    public String getPassword() {
        return this.password;
    }

    public UserRep setPassword(String password) {
        this.password = password;
        return this;
    }

    @Deprecated
    public Set<RoleRep> getRoles() {
        return this.roleReps;
    }

    @Deprecated
    public UserRep setRoles(Set<RoleRep> roleReps) {
        this.roleReps = roleReps;
        return this;
    }
}
