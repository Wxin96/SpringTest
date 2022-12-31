package com.apollo.springtest.domain.annotation;

// import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @ClassName FirstLevelRepository
 * @Description
 * @Author wangxin10
 * @Date 2022-12-30 14:18
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    // @AliasFor(annotation = FirstLevelRepository.class, value = "value")
    String value() default "";

}
