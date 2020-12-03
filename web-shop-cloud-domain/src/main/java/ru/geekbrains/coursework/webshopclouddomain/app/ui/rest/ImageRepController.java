package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.ImageService;
import ru.geekbrains.coursework.webshopclouduirestdao.ImageRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageRepController extends ARemoteServiceController<ImageRep, ImageService> implements ImageRepRemoteService {

    @Override
    @PostMapping("/save")
    public void save(@RequestParam("id") long id, @RequestParam("multipartFiles") List<MultipartFile> multipartFiles) {
        this.getService().save(id, multipartFiles);
    }
}
