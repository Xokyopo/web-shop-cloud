package ru.geekbrains.coursework.webshopclouddomain.app.domain;

import org.springframework.stereotype.Service;
import ru.geekbrains.coursework.webshopclouddomain.app.dao.RoleRepository;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Role;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

import java.util.Optional;

@Service
public class RoleService extends AService<Role, RoleRep, RoleRepository> {

    @Override
    public void save(RoleRep representation) {
        Optional<Role> roleOptional = (representation.getId() != 0) ?
                this.getRepository().findById(representation.getId()) : Optional.of(new Role());

        roleOptional.ifPresent(role -> {
            role.setName(representation.getName());
            role.setDescription(representation.getDescription());
            this.getRepository().save(role);
        });
    }
}
