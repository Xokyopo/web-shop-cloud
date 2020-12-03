package ru.geekbrains.coursework.webshopclouduirestdao;

import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

public interface ImageRepRemoteService extends ARemoteService<ImageRep> {
    void save(long id, List<MultipartFile> multipartFiles);
}