package ru.geekbrains.coursework.webshopclouduirestdao;

import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

public interface UserRepService extends AService<UserRep> {
    void addNewUser(String login, String password, String rePassword) throws Exception;
}
