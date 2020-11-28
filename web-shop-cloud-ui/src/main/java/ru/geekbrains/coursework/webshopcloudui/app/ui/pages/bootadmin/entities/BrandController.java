package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Brand;

@Controller
@RequestMapping("/admin/entities/brand")
public class BrandController extends AController<Brand, AService<Brand>> {
}
