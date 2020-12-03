package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.RoleRepRemoteService;

@FeignClient(value = "role-service", url = "http://localhost:9090/role")
public interface RoleRepConnector extends RoleRepRemoteService {
}
