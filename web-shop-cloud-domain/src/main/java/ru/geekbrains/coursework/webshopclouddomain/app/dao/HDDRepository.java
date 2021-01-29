package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;

@Repository
public class HDDRepository {
    private static final String PROPERTY_NAME = "local.file.repository";
    private Path rootDir;

    @Autowired
    public void init(Environment environment) {
        rootDir = Paths.get(Optional.ofNullable(environment.getProperty(PROPERTY_NAME, String.class)).orElse("tmp"));
        if (Files.notExists(rootDir)) {
            try {
                Files.createDirectories(rootDir);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    //may be add Nio ByteBuffer?
    public void saveToFile(String name, byte[] arr) {
        try {
            Files.write(getFullFileName(name), arr, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public byte[] loadFromFile(String name) {
        try {
            return Files.readAllBytes(getFullFileName(name));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public void delete(String name) {
        try {
            Files.deleteIfExists(getFullFileName(name));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private Path getFullFileName(String name) {
        return Paths.get(rootDir.toString(), name);
    }
}
