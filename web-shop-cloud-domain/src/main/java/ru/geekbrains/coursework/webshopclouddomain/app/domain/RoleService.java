package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.RoleRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Role;

@Service
public class RoleService extends AService<Role, RoleRepository> {
}
