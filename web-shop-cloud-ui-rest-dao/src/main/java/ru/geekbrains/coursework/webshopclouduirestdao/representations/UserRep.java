package ru.geekbrains.coursework.webshopclouduirestdao.representations;

import java.util.Set;

public class UserRep extends ARepresentation{
    private String password;
    private Set<RoleRep> roleReps;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleRep> getRoles() {
        return this.roleReps;
    }

    public void setRoles(Set<RoleRep> roleReps) {
        this.roleReps = roleReps;
    }
}
