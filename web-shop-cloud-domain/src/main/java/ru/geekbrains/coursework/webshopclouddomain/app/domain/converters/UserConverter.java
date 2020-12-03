package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Role;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.User;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.UserRep;

@Component
public class UserConverter extends AConverterIml<User, UserRep> {
    private AConverterIml<Role, RoleRep> roleConverter;

    @Autowired
    public UserConverter(AConverterIml<Role, RoleRep> roleConverter) {
        this.roleConverter = roleConverter;
    }

    @Override
    public UserRep toRepresentation(User entity) {
        UserRep result = new UserRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setPassword(entity.getPassword());
        result.setRoles(this.roleConverter.toRepresentations(entity.getRoles()));
        return result;
    }
}
