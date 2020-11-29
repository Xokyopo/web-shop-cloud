package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.stereotype.Repository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends ARepository<Role> {
    Optional<Role> findByName(String name);
}
