package ru.geekbrains.coursework.webshopclouddomain.app.utils;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

public class ProgramUtils {

    public static Optional<String> getRequestMappingValue(Object object) {
        String result = "";
        if (object.getClass().isAnnotationPresent(RequestMapping.class)) {
            result = object.getClass().getAnnotation(RequestMapping.class).value()[0];
        }
        return (result.isEmpty()) ? Optional.empty() : Optional.of(result);
    }

    public static String removeSlashOnStartAndEnd(String text) {
        return (text.substring(
                text.startsWith("/") ? 1 : 0,
                text.endsWith("/") ? text.length() - 1 : text.length()));
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
