package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopcloudui.app.domain.ImageService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Image;

import java.util.List;
import java.util.Optional;
//TODO delete Program utils
@Controller
@RequestMapping("/admin/entities/image")
public class ImageController extends AController<Image, ImageService> {

    @Override
    @GetMapping("/showAll")
    public String showAll(Model model) {
        model.addAttribute("programUtils", new ProgramUtils());
        return super.showAll(model);
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute("programUtils", new ProgramUtils());
        return super.show(model, id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<byte[]> getAsResource(@PathVariable("id") Long id) {
        Optional<Image> optionalImage = this.getService().getById(id);

        if (optionalImage.isPresent()) {
            Image image = optionalImage.get();
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(image.getType()))
                    .contentLength(image.getSize())
                    .body(image.getData());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public String save(Image entity, @RequestParam("uploadList") List<MultipartFile> multipartFiles) {
        this.getService().save(entity, multipartFiles);
        return "redirect:/" + this.getRootPath() + "/showAll";
    }

    @Override
    @PostMapping("/save/old")
    public String save(Image entity) {
        throw new UnsupportedOperationException("method save(Image entity) not support use save(Image entity, Multipart)");
    }
}
