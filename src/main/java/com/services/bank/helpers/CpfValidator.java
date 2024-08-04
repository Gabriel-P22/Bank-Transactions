package com.services.bank.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfValidator {
    public static boolean isValid(String value, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
