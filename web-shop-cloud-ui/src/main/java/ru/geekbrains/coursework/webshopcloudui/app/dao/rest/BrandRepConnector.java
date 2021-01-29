package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

//@FeignClient(value = "brand-service", url = "http://localhost:9090/brand")
@FeignClient(name = "${feign.name}", path = "/brand")
public interface BrandRepConnector extends ARemoteService<BrandRep> {
}
