package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.UserService;
import ru.geekbrains.coursework.webshopclouduirestdao.UserRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

public class UserRepController extends ARemoteServiceController<UserRep, UserService> implements UserRepRemoteService {

    @Override
    public void addNewUser(String login, String password) throws Exception {
        this.getService().addNewUser(login, password);
    }
}
