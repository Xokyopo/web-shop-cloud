package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

//@FeignClient(value = "category-service", url = "http://localhost:9090/category")
@FeignClient(name = "${feign.name}", path = "/category")
public interface CategoryRepConnector extends ARemoteService<CategoryRep> {
}
