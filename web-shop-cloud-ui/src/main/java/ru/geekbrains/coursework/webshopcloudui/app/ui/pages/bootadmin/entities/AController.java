package ru.geekbrains.coursework.webshopcloudui.app.ui.pages.bootadmin.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.coursework.webshopclouduirestdao.AService;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

public abstract class AController<E, S extends AService<E>> {
    private String entityName;
    private String rootPath;
    private String entitiesTablePath;
    private String editFormPath;
    private S service;

    @Autowired
    public void init(S service) {
        //may be rewrite???
        rootPath = AController.getRequestMappingValue(this).stream()
                .map(AController::removeSlashOnStartAndEnd)
                .findFirst()
                .orElse("");
        this.service = service;
        this.entityName = service.getEntityName().toLowerCase();
        this.entitiesTablePath = rootPath + "-list";
        this.editFormPath = rootPath + "-edit-form";
    }

    @GetMapping("/showAll")
    public String showAll(Model model) {
        model.addAttribute(this.entityName + "s", this.service.getAll());
        return this.entitiesTablePath;
    }

    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        model.addAttribute(this.entityName, this.service.getById(id).orElseThrow(() -> new EntityNotFoundException("Entity with id [" + id + "not found")));
        return this.editFormPath;
    }

    @PostMapping("/del/{id}")
    public String delete(@PathVariable("id") Long id) {
        this.service.delete(id);
        return "redirect:/" + this.rootPath + "/showAll";
    }

    @PostMapping("/save")
    public String save(E entity) {
        this.service.save(entity);
        return "redirect:/" + this.rootPath + "/showAll";
    }

    public S getService() {
        return service;
    }

    protected String getRootPath() {
        return rootPath;
    }

    protected String getEntitiesTablePath() {
        return entitiesTablePath;
    }

    protected String getEditFormPath() {
        return editFormPath;
    }

    private static Optional<String> getRequestMappingValue(Object object) {
        String result = "";
        if (object.getClass().isAnnotationPresent(RequestMapping.class)) {
            result = object.getClass().getAnnotation(RequestMapping.class).value()[0];
        }
        return (result.isEmpty()) ? Optional.empty() : Optional.of(result);
    }

    private static String removeSlashOnStartAndEnd(String text) {
        return (text.substring(
                text.startsWith("/") ? 1 : 0,
                text.endsWith("/") ? text.length() - 1 : text.length()));
    }
}
