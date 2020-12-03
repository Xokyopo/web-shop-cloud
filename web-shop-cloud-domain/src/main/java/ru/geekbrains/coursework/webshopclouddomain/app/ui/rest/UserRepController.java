package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.UserService;
import ru.geekbrains.coursework.webshopclouduirestdao.UserRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

@RestController
@RequestMapping("/user")
public class UserRepController extends ARemoteServiceController<UserRep, UserService> implements UserRepRemoteService {

    @Override
    @PostMapping("/addNewUser")
    public void addNewUser(@RequestParam("login") String login, @RequestParam("password") String password) {
        this.getService().addNewUser(login, password);
    }
}
