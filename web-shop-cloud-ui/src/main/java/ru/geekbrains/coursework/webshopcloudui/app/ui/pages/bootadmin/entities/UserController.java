package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.AService;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.Role;
import ru.geekbrains.coursework.webshopcloudui.app.domain.entities.User;

@Controller
@RequestMapping("/admin/entities/user")
public class UserController extends AController<User, AService<User>> {
    private AService<Role> roleService;

    @Autowired
    public UserController(AService<Role> roleService) {
        this.roleService = roleService;
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute("allRoles", roleService.getAll());
        return super.show(model, id);
    }
}
