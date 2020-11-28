package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.BrandRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Brand;

@Service
public class BrandService extends AService<Brand, BrandRepository> {
}
