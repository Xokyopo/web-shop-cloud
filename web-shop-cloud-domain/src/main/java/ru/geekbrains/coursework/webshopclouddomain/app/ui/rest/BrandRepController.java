package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.BrandService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

@RestController
@RequestMapping("/bran")
public class BrandRepController extends ARemoteServiceController<BrandRep, BrandService> {
}
