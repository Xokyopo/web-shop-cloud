package ru.geekbrains.coursework.webshopclouddomain.app.ui.rest;

import ru.geekbrains.coursework.webshopclouddomain.app.domain.RoleService;
import ru.geekbrains.coursework.webshopclouduirestdao.RoleRepRemoteService;
import ru.geekbrains.coursework.webshopclouduirestdao.representations.RoleRep;

public class RoleRepController extends ARemoteServiceController<RoleRep, RoleService> implements RoleRepRemoteService {
}
