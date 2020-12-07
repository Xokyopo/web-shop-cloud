package ru.geekbrains.coursework.webshopcloudui.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final DataSource dataSource;

    @Autowired
    public SecurityConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //can't change the sequence
        http
                .authorizeRequests()
                .antMatchers("/admin/**")
                .hasRole("ADMIN")
                .antMatchers("/**")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .passwordEncoder(passwordEncoder)
                .usersByUsernameQuery("SELECT `name`, `password`, true FROM users WHERE `name`=?")
                .authoritiesByUsernameQuery(
                        "SELECT users.`name` as `username`, roles.`name` as `authority` FROM users\n" +
                                "JOIN users_roles ON users_roles.users_id = users.id\n" +
                                "JOIN roles ON roles.id = users_roles.roles_id WHERE users.`name` = ?");
    }
}
