package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.BrandRepRemoteService;

@FeignClient(value = "brand-service", url = "http://localhost:9090/brand")
public interface BrandRepConnector extends BrandRepRemoteService {
}
