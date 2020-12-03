package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.UserRepRemoteService;

@FeignClient(value = "user-service", url = "http://localhost:9090/user")
public interface UserRepConnector extends UserRepRemoteService {
}
