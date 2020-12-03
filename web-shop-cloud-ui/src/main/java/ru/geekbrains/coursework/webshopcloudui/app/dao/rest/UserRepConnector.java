package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

@FeignClient(value = "user-service", url = "http://localhost:9090/user")
public interface UserRepConnector extends ARemoteService<UserRep> {
    void addNewUser(String login, String password) throws Exception;
}
