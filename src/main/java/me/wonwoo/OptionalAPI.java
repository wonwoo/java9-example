package me.wonwoo;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by wonwoolee on 2017. 6. 11..
 */
public class OptionalAPI {

  public static void main(String[] args) {
    Optional<String> foo = Optional.ofNullable("foo");
    Stream<String> stream = foo.stream();
    System.out.println(stream);

    Optional<String> foo1 = Optional.ofNullable("foo");
    Optional<String> bar1 = foo1.or(() -> Optional.of("bar"));
    System.out.println(bar1.get()); //foo

    Optional<String> foo2 = Optional.ofNullable(null);
    Optional<String> bar2 = foo2.or(() -> Optional.of("bar"));
    System.out.println(bar2.get()); //bar


    Optional<String> foo3 = Optional.ofNullable("foo");
    foo3.ifPresentOrElse(System.out::println, () -> System.out.println("bar")); //foo

    Optional<String> foo4 = Optional.ofNullable(null);
    foo4.ifPresentOrElse(System.out::println, () -> System.out.println("bar")); //bar

  }
}
