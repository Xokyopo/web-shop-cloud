package ru.geekbrains.coursework.webshopclouddomain.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ARepository<E> extends JpaRepository<E, Long> {
}
