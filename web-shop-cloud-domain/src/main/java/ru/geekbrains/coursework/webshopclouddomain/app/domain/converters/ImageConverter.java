package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Image;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ImageRep;

@Component
public class ImageConverter extends AConverterIml<Image, ImageRep> {

    @Override
    public ImageRep toRepresentation(Image entity) {
        ImageRep result = new ImageRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setType(entity.getType());
        result.setSize(this.convertToHumanFileLength(entity.getSize()));
        result.setPath(entity.getPath());
        return result;
    }

    public String convertToHumanFileLength(float fileLength) {
        float baseLength = 1024;
        String[] prefixes = new String[]{"B", "KB", "MB", "GB", "TB", "PB"};
        int count;
        for (count = 0; fileLength >= baseLength; count++) {
            fileLength = fileLength / baseLength;
        }
        return String.format("%.2f %s", fileLength, prefixes[count]);
    }
}
