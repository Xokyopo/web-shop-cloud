package ru.geekbrains.coursework.webshopcloudui.app.ui.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.coursework.webshopclouduirestdao.UserRepService;

public class SecurityController {
    private UserRepService userRepAService;

    @Autowired
    public SecurityController(UserRepService userRepAService) {
        this.userRepAService = userRepAService;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@RequestParam("login") String login,
                          @RequestParam("password") String password,
                          @RequestParam("re_password") String rePassword) {
        try {
            this.userRepAService.addNewUser(login, password, rePassword);
            return "login";
        } catch (Exception e) {
            e.printStackTrace();
            return "registration";
        }
    }
}
