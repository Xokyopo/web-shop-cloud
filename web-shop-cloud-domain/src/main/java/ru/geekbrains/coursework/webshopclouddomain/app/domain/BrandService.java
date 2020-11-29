package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.BrandRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Brand;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

import java.util.Optional;

@Service
public class BrandService extends AService<Brand, BrandRep, BrandRepository> {

    @Override
    public void save(BrandRep representation) {
        Optional<Brand> brandOptional = (representation.getId() != 0) ?
                this.getRepository().findById(representation.getId()) : Optional.of(new Brand());

        brandOptional.ifPresent(brand -> {
            brand.setName(representation.getName());
            brand.setLogoUrl(representation.getLogoUrl());
            this.getRepository().save(brand);
        });
    }
}
