package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Image;

import java.util.List;

public interface ImageService extends AService<Image> {
    void save(Image entity, List<MultipartFile> multipartFiles);
}
