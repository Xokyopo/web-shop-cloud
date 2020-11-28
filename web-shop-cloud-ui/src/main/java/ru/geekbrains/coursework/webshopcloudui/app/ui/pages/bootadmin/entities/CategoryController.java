package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshop.app.domain.CategoryService;
import ru.geekbrains.coursework.webshop.app.domain.entities.Category;

@Controller
@RequestMapping("/admin/entities/category")
public class CategoryController extends AController<Category, CategoryService> {
}
