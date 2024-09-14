package com.feiniaojin.gracefuresponse.example.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserIdValidator implements ConstraintValidator<UserId, String> {

    private static final int LENGTH = 10;

    private static final String PRE_FIX = "U";

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {

        if (StringUtils.isBlank(s)) {
            return false;
        }
        if (s.length() != LENGTH) {
            return false;
        }
        return s.startsWith(PRE_FIX);
    }
}
