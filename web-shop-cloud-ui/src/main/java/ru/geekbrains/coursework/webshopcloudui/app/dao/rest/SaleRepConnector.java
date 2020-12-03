package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.SaleRepService;

@FeignClient(value = "sale-service", url = "http://localhost:9090/sale")
public interface SaleRepConnector extends SaleRepService {
}
