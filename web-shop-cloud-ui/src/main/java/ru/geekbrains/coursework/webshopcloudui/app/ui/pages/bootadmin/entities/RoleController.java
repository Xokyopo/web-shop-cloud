package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities.RoleRep;

@Controller
@RequestMapping("/admin/entities/role")
public class RoleController extends AController<RoleRep, AService<RoleRep>> {
}
