package ru.geekbrains.coursework.webshopcloudui.app.domain;

import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities.UserRep;

public interface UserRepService extends AService<UserRep> {
    void addNewUser(String login, String password, String rePassword) throws Exception;
}
