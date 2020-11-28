package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.UserRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.User;

@Service
public class UserService extends AService<User, UserRepository> {
}
