package ru.geekbrains.coursework.webshopcloudsecurityandlogging.app.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedBCryptPasswordEncoder extends BCryptPasswordEncoder {

    public boolean isBCryptPassword(CharSequence checkedText) {
        Pattern bcryptPattern = Pattern.compile("\\A\\$2(a|y|b)?\\$(\\d\\d)\\$[./0-9A-Za-z]{53}");
        Matcher matcher = bcryptPattern.matcher(checkedText);
        return matcher.matches();
    }
}
