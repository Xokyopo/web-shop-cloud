package ru.geekbrains.coursework.webshopclouduirestdao;

import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

public interface UserRepRemoteService extends ARemoteService<UserRep> {
    void addNewUser(String login, String password) throws Exception;
}
