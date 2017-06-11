package me.wonwoo;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by wonwoolee on 2017. 6. 11..
 */
public class StreamAPI {

  public static void main(String[] args) {
    List<Integer> numbers1 = List.of(1, 3, 7, 8, 15, 4)
        .stream()
        .takeWhile(i -> i < 10)
        .collect(toList());
    System.out.println(numbers1);


    List<Integer> numbers2 = List.of(1, 3, 7, 8, 15, 4)
        .stream()
        .dropWhile(i -> i < 10)
        .collect(toList());
    System.out.println(numbers2);


    Stream<?> stream = Stream.ofNullable(null);
    System.out.println(stream);
  }
}
