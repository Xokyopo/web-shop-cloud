package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.CategoryRepRemoteService;

@FeignClient(value = "category-service", url = "http://localhost:9090/category")
public interface CategoryRepConnector extends CategoryRepRemoteService {
}
