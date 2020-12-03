package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ImageRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Image;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ImageService extends AService<Image, ImageRep, ImageRepository> {

    public void save(long id, List<MultipartFile> multipartFiles) {
        if (id == 0 && !multipartFiles.isEmpty()) {
            this.getRepository().saveAll(multipartFiles.stream().map(Image::new).collect(Collectors.toList()));
        } else {
            Optional<Image> imageOptional = this.getRepository().findById(id);
            imageOptional.ifPresent(image -> {
                //        TODO обновление
                multipartFiles.stream().findFirst().ifPresent(image::setAll);
                this.getRepository().save(image);
            });
        }
    }

    @Override
    public void save(ImageRep representation) {
        throw new UnsupportedOperationException("ImageService.save()");
    }

    public byte[] getImageData(Long id) {
        return this.getRepository().findById(id).get().getData();
    }
}
