package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.RoleService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

@RestController
@RequestMapping("/role")
public class RoleRepController extends ARemoteServiceController<RoleRep, RoleService> {
}
