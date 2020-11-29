package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.RoleRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.UserRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.User;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService extends AService<User, UserRep, UserRepository> {
    private final RoleRepository roleRepository;

    @Autowired
    public UserService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(UserRep representation) {
        this.getRepository().findById(representation.getId()).ifPresent(user -> {
            user.setName(representation.getName());
            user.setPassword(representation.getPassword());
            user.setRoles(new HashSet<>(
                    this.roleRepository.findAllById(
                            representation.getRoles().stream().map(RoleRep::getId).collect(Collectors.toList())
                    )
            ));
        });
    }

    public void addNewUser(String login, String password) {
        User user = new User();
        user.setName(login);
        user.setPassword(password);
        user.setRoles(Set.of(this.roleRepository.findByName("ROLE_USER").orElseThrow(() ->
                new IllegalArgumentException("Roles not found in database"))));
        this.getRepository().save(user);
    }
}
