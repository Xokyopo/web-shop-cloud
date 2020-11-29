package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.ImageRep;

import java.util.List;

public interface ImageRepService extends AService<ImageRep> {
    void save(ImageRep entity, List<MultipartFile> multipartFiles);
}
