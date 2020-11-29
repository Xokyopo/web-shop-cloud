package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopclouduirestdao.AService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

@Controller
@RequestMapping("/admin/entities/role")
public class RoleController extends AController<RoleRep, AService<RoleRep>> {
}
