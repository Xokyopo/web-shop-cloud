package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.HDDRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.ImageRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Image;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

import java.util.List;

@Service
public class ImageService extends AService<Image, ImageRep, ImageRepository> {
    private HDDRepository hddRepository;

    @Autowired
    public ImageService(HDDRepository hddRepository) {
        this.hddRepository = hddRepository;
    }

    public void save(long id, List<MultipartFile> multipartFiles) {
//        if (id == 0 && !multipartFiles.isEmpty()) {
//            this.getRepository().saveAll(multipartFiles.stream().map(Image::new).collect(Collectors.toList()));
//        } else {
//            Optional<Image> imageOptional = this.getRepository().findById(id);
//            imageOptional.ifPresent(image -> {
//                //        TODO обновление
//                multipartFiles.stream().findFirst().ifPresent(image::setAll);
//                this.getRepository().save(image);
//            });
//        }
        throw new UnsupportedOperationException("");
    }

    @Override
    public void save(ImageRep representation) {
        throw new UnsupportedOperationException("ImageService.save()");
    }

    public byte[] getImageData(Long id) {
        return this.getRepository().findById(id)
                .map(image ->
                        (image.getPath() == null || image.getPath().isBlank()) ? image.getData() : this.hddRepository.loadFromFile(image.getPath()))
                .orElse(null);
    }


//
//    public void setAll(MultipartFile multipartFile) {
//        //todo data byte limit is (2^16 = 65 536)
//        try {
//            if (this.data != null && !Arrays.equals(this.data, multipartFile.getBytes())) {
//                this.deleteFileBeforeRemove();
//            }
//
//            this.setName(multipartFile.getOriginalFilename());
//            this.type = multipartFile.getContentType();
//            this.size = multipartFile.getSize();
//            //65500 max blob size in MySql
//            this.path = (multipartFile.getBytes().length > 65500) ? UUID.randomUUID().toString() : null;
//            this.data = multipartFile.getBytes();
//        } catch (IOException e) {
//            throw new UncheckedIOException(e);
//        }
//    }
//
//    @PrePersist
//    @PreUpdate
//    public void saveBigFileData() {
//        if (!this.path.isBlank()) {
//            HDDRepository.getInstance().saveToFile(this.path, this.data);
//            this.data = null;
//        }
//    }
//
//    @PreRemove
//    public void deleteFileBeforeRemove() {
//        if (!this.path.isBlank()) {
//            HDDRepository.getInstance().delete(this.path);
//        }
//    }
//
//    @PostLoad
//    public void loadBigFileData() {
//        if (!this.path.isBlank()) {
//            this.data = HDDRepository.getInstance().loadFromFile(this.path);
//        }
//    }
}
