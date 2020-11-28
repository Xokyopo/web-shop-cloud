package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BootAdminMainController {

    @GetMapping
    public String showMainPage() {
        return "admin/greeting";
    }
}
