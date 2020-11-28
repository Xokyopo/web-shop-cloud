package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshop.app.dao.UserRepository;
import ru.geekbrains.coursework.webshop.app.domain.entities.User;

@Service
public class UserService extends ru.geekbrains.coursework.webshop.app.domain.AService<User, UserRepository> {
}
