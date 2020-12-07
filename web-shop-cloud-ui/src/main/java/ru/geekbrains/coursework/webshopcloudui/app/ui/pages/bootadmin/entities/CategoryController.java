package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

@Controller
@RequestMapping("/admin/entities/category")
public class CategoryController extends AController<CategoryRep, ARemoteService<CategoryRep>> {
    @Override
    public String getEntityNameByLoverCase() {
        return "category";
    }
}
