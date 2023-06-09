package idv.laborLab.redisClient.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LaborLabCachePut {

    @AliasFor("cacheNames")
    String[] keys() default {};

    @AliasFor("keys")
    String[] cacheNames() default {};
}
