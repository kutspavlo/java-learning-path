package Java_Advanced_Practice5_model;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

/**
 * If it’s used with a field or a getter it means that the field can’t be null.
 * If the field is presented as String, Collection or Map then it can’t
 * be empty as well
 */

public @interface NotEmpty {

}
