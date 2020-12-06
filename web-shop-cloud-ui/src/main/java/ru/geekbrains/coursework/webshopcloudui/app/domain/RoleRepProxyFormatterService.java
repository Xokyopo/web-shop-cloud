package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

@Component
@Scope("application")
public class RoleRepProxyFormatterService extends AProxyFormatterService<RoleRep> {
    @Override
    public String convertObjectToString(RoleRep object) {
        return Long.toString(object.getId());
    }
}
