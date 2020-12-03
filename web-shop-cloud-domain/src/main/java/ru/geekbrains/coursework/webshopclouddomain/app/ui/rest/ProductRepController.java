package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.ProductService;
import ru.geekbrains.coursework.webshopclouduirestdao.ProductRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.ProductRep;

public class ProductRepController extends ARemoteServiceController<ProductRep, ProductService> implements ProductRepRemoteService {
}
