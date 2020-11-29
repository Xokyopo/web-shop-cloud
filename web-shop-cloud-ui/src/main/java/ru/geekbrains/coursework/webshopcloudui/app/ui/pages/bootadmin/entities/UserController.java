package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities.RoleRep;
import ru.geekbrains.coursework.webshopcloudui.app.domain.representations.entities.UserRep;

@Controller
@RequestMapping("/admin/entities/user")
public class UserController extends AController<UserRep, AService<UserRep>> {
    private AService<RoleRep> roleService;

    @Autowired
    public UserController(AService<RoleRep> roleService) {
        this.roleService = roleService;
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute("allRoles", roleService.getAll());
        return super.show(model, id);
    }
}
