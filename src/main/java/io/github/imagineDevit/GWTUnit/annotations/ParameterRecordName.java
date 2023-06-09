package io.github.imagineDevit.GWTUnit.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to specify the name of a record generated for a method .
 *
 * @see io.github.imagineDevit.GWTUnit.annotations.GwtProxyable
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface ParameterRecordName {

    String value();
}
