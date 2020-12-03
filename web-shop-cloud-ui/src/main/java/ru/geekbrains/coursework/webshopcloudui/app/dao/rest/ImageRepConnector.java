package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import ru.geekbrains.coursework.webshopclouduirestdao.ImageRepRemoteService;

@FeignClient(value = "image-service", url = "http://localhost:9090/image")
public interface ImageRepConnector extends ImageRepRemoteService {
}
