package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.CategoryService;
import ru.geekbrains.coursework.webshopclouduirestdao.CategoryRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.CategoryRep;

public class CategoryRepController extends ARemoteServiceController<CategoryRep, CategoryService> implements CategoryRepRemoteService {
}
