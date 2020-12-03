package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ProductRepRemoteService;

@FeignClient(value = "product-service", url = "http://localhost:9090/product")
public interface ProductRepConnector extends ProductRepRemoteService {
}
