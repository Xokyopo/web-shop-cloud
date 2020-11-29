package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

@Controller
@RequestMapping("/admin/entities/product")
public class ProductController extends AController<ProductRep, ARemoteService<ProductRep>> {
    private ARemoteService<CategoryRep> categoryService;
    private ARemoteService<BrandRep> brandService;

    @Autowired
    public ProductController(ARemoteService<CategoryRep> categoryService, ARemoteService<BrandRep> brandService) {
        this.categoryService = categoryService;
        this.brandService = brandService;
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute("allBrands", brandService.getAll());
        model.addAttribute("allCategories", categoryService.getAll());
        return super.show(model, id);
    }
}
