package me.wonwoo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by wonwoolee on 2017. 6. 11..
 */
public class CollectionsFactory {

  public static void main(String[] args) {
    List<Integer> listNumbers = List.of(1, 2, 3, 4, 5);
    System.out.println(listNumbers);

    Set<Integer> setNumbers = Set.of(1, 2, 3, 4, 5);
    System.out.println(setNumbers);

//    Set.of(1, 1, 3, 4, 5); //error

    Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
    System.out.println(map);

//    Map.of("key1", "value1", "key1", "value2"); //error

//    listNumbers.add(6); //error
//    setNumbers.add(6); //error
//    map.put("key3","value3"); //error
  }
}
