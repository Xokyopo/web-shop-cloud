package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouddomain.app.domain.entities.Role;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

@Component
public class RoleConverter extends AConverterIml<Role, RoleRep> {

    @Override
    public RoleRep toRepresentation(Role entity) {
        RoleRep result = new RoleRep();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setDescription(entity.getDescription());
        return result;
    }
}
