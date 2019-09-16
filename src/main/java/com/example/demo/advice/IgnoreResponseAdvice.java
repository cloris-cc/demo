package com.example.demo.advice;

import java.lang.annotation.*;

/**
 * @author Jacky
 * Date: 2019/8/28 15:36
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}
