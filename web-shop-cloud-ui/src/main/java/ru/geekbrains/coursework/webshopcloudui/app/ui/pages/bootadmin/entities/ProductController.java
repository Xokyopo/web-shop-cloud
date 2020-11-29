package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.BrandRep;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.CategoryRep;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.ProductRep;

@Controller
@RequestMapping("/admin/entities/product")
public class ProductController extends AController<ProductRep, AService<ProductRep>> {
    private AService<CategoryRep> categoryService;
    private AService<BrandRep> brandService;

    @Autowired
    public ProductController(AService<CategoryRep> categoryService, AService<BrandRep> brandService) {
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
