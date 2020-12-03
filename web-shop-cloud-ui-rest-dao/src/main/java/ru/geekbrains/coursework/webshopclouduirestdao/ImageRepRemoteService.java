package ru.geekbrains.coursework.webshopclouduirestdao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

public interface ImageRepRemoteService extends ARemoteService<ImageRep> {
    @PostMapping("/save")
    void save(@RequestParam("id") long id, @RequestParam("multipartFiles") List<MultipartFile> multipartFiles);

    @GetMapping("/getImageData/{id}")
    byte[] getImageData(@PathVariable("id") Long id);
}
