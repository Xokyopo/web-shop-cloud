package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.ProductService;
import ru.geekbrains.coursework.webshopclouduirestdao.ProductRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

@RestController
@RequestMapping("/product")
public class ProductRepController extends ARemoteServiceController<ProductRep, ProductService> implements ProductRepRemoteService {
}
