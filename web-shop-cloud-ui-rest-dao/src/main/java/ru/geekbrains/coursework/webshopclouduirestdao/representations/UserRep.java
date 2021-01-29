package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.util.Set;

public class UserRep extends ARepresentation{
    private String password;
    private Set<RoleRep> roles;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleRep> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<RoleRep> roleReps) {
        this.roles = roleReps;
    }
}
