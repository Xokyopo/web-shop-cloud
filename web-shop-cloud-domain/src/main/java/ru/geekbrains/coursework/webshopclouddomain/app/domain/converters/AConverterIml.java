package ru.geekbrains.coursework.webshopclouddomain.app.domain.converters;

import java.util.Set;
import java.util.stream.Collectors;

public abstract class AConverterIml<E, P> implements AConverter<E, P> {
    public Set<P> toRepresentations(Set<E> entities) {
        return entities.stream().map(this::toRepresentation).collect(Collectors.toSet());
    }
}
