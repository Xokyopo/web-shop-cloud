package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.CategoryService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

@RestController
@RequestMapping("/category")
public class CategoryRepController extends ARemoteServiceController<CategoryRep, CategoryService> {
}
