package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

public interface AConverter<E, P> {
    P toRepresentation(E entity);
}
