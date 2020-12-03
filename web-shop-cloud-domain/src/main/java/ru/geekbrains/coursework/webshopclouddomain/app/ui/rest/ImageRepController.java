package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.ImageService;
import ru.geekbrains.coursework.webshopclouduirestdao.ImageRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

public class ImageRepController extends ARemoteServiceController<ImageRep, ImageService> implements ImageRepRemoteService {

    @Override
    public void save(long id, List<MultipartFile> multipartFiles) {
        this.getService().save(id, multipartFiles);
    }
}
