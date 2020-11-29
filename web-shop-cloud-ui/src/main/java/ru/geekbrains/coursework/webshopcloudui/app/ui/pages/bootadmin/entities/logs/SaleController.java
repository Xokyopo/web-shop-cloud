package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities.logs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopclouduirestdao.SaleRepService;

import javax.persistence.EntityNotFoundException;

@Controller
@RequestMapping("/admin/entities/logs/sale")
public class SaleController {
    private SaleRepService saleService;

    public SaleController(SaleRepService saleService) {
        this.saleService = saleService;
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {
        model.addAttribute("sales", saleService.getAll());
        return "admin/entities/logs/sale-list";
    }

    @GetMapping("/show/{id}")
    public String showOne(Model model, @PathVariable("id") long id) {
        model.addAttribute("product", saleService.getProductBySaleId(id).orElseThrow(EntityNotFoundException::new));
        return "admin/entities/logs/sale-product-info";
    }
}
