package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouduirestdao.ImageRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/entities/image")
public class ImageController extends AController<ImageRep, ImageRepRemoteService> {

    @GetMapping("/get/{id}")
    public ResponseEntity<byte[]> getAsResource(@PathVariable("id") Long id) {
        Optional<ImageRep> optionalImage = this.getService().getById(id);

        return optionalImage.map(imageRep -> ResponseEntity.ok()
                .contentType(MediaType.valueOf(imageRep.getType()))
//                .contentLength(imageRep.getSize())
                .body(this.getService().getImageData(id))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/save")
    public String save(@RequestParam("id") long id, @RequestParam("uploadList") List<MultipartFile> multipartFiles) {
        this.getService().save(id, multipartFiles);
        return "redirect:/" + this.getRootPath() + "/showAll";
    }

    @Override
    @PostMapping("/save/old")
    @Deprecated
    public String save(ImageRep entity) {
        throw new UnsupportedOperationException("method save(Image entity) not support use save(Image entity, Multipart)");
    }
}
