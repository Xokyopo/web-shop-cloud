package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopcloudui.app.domain.RoleRepProxyFormatterService;
import ru.geekbrains.coursework.webshopclouduirestdao.ARemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

@Controller
@RequestMapping("/admin/entities/user")
public class UserController extends AController<UserRep, ARemoteService<UserRep>> {
    private ARemoteService<RoleRep> roleService;

    @Autowired
    public UserController(RoleRepProxyFormatterService roleService) {
        this.roleService = roleService;
    }

    @Override
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute("allRoles", roleService.getAll());
        return super.show(model, id);
    }

    @Override
    public String getEntityNameByLoverCase() {
        return "user";
    }
}
