package ru.geekbrains.coursework.webshopcloudui.app.dao.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

@FeignClient(value = "image-service", url = "http://localhost:9090/image")
public interface ImageRepConnector extends ARemoteService<ImageRep> {
    @PostMapping("/save")
    void save(@RequestParam("id") long id, @RequestParam("multipartFiles") List<MultipartFile> multipartFiles);

    @Override
    @PostMapping("/save/old")
    void save(ImageRep entity);

    @GetMapping("/getImageData/{id}")
    byte[] getImageData(@PathVariable("id") Long id);
}
