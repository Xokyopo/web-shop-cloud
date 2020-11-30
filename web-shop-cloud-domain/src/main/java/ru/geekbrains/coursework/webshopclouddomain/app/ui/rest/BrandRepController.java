package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.BrandService;
import ru.geekbrains.coursework.webshopclouduirestdao.BrandRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.BrandRep;

public class BrandRepController extends ARemoteServiceController<BrandRep, BrandService> implements BrandRepRemoteService {
}
