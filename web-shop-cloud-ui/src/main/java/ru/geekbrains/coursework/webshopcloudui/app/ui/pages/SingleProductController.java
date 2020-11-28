package ru.geekbrains.coursework.webshopcloudui.app.ui.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Product;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class SingleProductController {
    private AService<Product> productService;
    private CartController cartController;

    @Autowired
    public SingleProductController(AService<Product> productService, CartController cartController) {
        this.productService = productService;
        this.cartController = cartController;
    }

    @GetMapping("/{id}")
    public String showSingleProduct(Model model, @PathVariable("id") long id) {
        if (id == 0) throw new IllegalArgumentException(
                "id in {public String showSingleProduct(Model model, @PathVariable(\"id\") long id)} can be 0");
        model.addAttribute("product", this.productService.getById(id).orElseThrow(IllegalArgumentException::new));
        model.addAttribute("relatedProducts", this.productService.getAll().parallelStream().limit(6).collect(Collectors.toList()));

        return "single-product";
    }

    @PostMapping("/addToCart")
    public String add(@RequestParam("id") long id, @RequestParam(value = "count", defaultValue = "1") int count) {
        this.cartController.add(id, count);
        return "redirect:/product/" + id;
    }
}
