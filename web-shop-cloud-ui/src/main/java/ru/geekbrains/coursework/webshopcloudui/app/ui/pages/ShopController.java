package ru.geekbrains.coursework.webshopcloudui.app.ui.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ShopController {
    private static final int PRODUCT_LIMIT_ON_PAGE = 12; //default 12
    private ARemoteService<ProductRep> productService;

    @Autowired
    public ShopController(ARemoteService<ProductRep> productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getMainPage() {
        return "index";
    }

    @GetMapping("/shop")
    public String show(Model model, @RequestParam("page") Optional<Integer> page) {
        model.addAttribute("productsPages", this.productService.getAll(PageRequest.of(page.orElse(1) - 1, PRODUCT_LIMIT_ON_PAGE)));
        return "shop";
    }

    @GetMapping("/admin")
    public String showMainPage() {
        return "admin/greeting";
    }

    @GetMapping("/product/{id}")
    public String showSingleProduct(Model model, @PathVariable("id") long id) {
        if (id == 0) throw new IllegalArgumentException("id in {showSingleProduct(Model model, long id)} can't be 0");
        model.addAttribute("product", this.productService.getById(id).orElseThrow(IllegalArgumentException::new));
        model.addAttribute("relatedProducts", this.productService.getAll().parallelStream().limit(6).collect(Collectors.toList()));

        return "single-product";
    }
}
