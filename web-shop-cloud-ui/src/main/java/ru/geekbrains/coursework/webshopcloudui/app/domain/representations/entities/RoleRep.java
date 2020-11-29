package ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities;

import java.util.Set;

public class RoleRep extends ARepresentation<RoleRep> {
    private String description;
    private Set<UserRep> userReps;

    public String getDescription() {
        return this.description;
    }

    public RoleRep setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<UserRep> getUsers() {
        return this.userReps;
    }

    public RoleRep setUsers(Set<UserRep> userReps) {
        this.userReps = userReps;
        return this;
    }
}
