package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.stereotype.Repository;
import ru.geekbrains.coursework.webshop.app.domain.entities.User;

@Repository
public interface UserRepository extends ARepository<User> {
}
