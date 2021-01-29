package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

//@FeignClient(value = "product-service", url = "http://localhost:9090/product")
@FeignClient(name = "${feign.name}", path = "/product")
public interface ProductRepConnector extends ARemoteService<ProductRep> {
}
