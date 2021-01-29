package ru.geekbrains.coursework.webshopcloudui.app.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

@Component
@Scope("application")
public class BrandRepProxyFormatterService extends AProxyFormatterService<BrandRep> {
    @Override
    public String convertObjectToString(BrandRep object) {
        return Long.toString(object.getId());
    }
}
