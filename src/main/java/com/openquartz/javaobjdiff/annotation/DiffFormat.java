package com.openquartz.javaobjdiff.annotation;

import com.openquartz.javaobjdiff.DiffFormatter;
import com.openquartz.javaobjdiff.formatter.DefaultDiffFormatter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义格式化展示
 * @author svnee
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Inherited
public @interface DiffFormat {

    /**
     * time format
     */
    Class<? extends DiffFormatter> using() default DefaultDiffFormatter.class;

    /**
     * formatter pattern
     *
     * @return pattern
     */
    String pattern() default "";
}
