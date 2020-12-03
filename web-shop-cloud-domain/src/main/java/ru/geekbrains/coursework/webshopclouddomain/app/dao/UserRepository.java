package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.stereotype.Repository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.User;

@Repository
public interface UserRepository extends ARepository<User> {
}
