package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

@FeignClient(value = "role-service", url = "http://localhost:9090/role")
public interface RoleRepConnector extends ARemoteService<RoleRep> {
}
