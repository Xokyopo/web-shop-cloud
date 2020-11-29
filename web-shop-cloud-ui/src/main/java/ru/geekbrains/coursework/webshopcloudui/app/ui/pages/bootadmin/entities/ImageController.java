package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopcloudui.app.domain.ImageRepService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities.ImageRep;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/entities/image")
public class ImageController extends AController<ImageRep, ImageRepService> {

    @Override
    @GetMapping("/showAll")
    public String showAll(Model model) {
        return super.showAll(model);
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        return super.show(model, id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<byte[]> getAsResource(@PathVariable("id") Long id) {
        Optional<ImageRep> optionalImage = this.getService().getById(id);

        if (optionalImage.isPresent()) {
            ImageRep imageRep = optionalImage.get();
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(imageRep.getType()))
//                    .contentLength(imageRep.getSize())
                    .body(imageRep.getData());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public String save(ImageRep entity, @RequestParam("uploadList") List<MultipartFile> multipartFiles) {
        this.getService().save(entity, multipartFiles);
        return "redirect:/" + this.getRootPath() + "/showAll";
    }

    @Override
    @PostMapping("/save/old")
    public String save(ImageRep entity) {
        throw new UnsupportedOperationException("method save(Image entity) not support use save(Image entity, Multipart)");
    }
}
