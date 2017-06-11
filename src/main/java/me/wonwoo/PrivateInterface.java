package me.wonwoo;

/**
 * Created by wonwoolee on 2017. 6. 11..
 */
public interface PrivateInterface {

  default void doSome() {
    System.out.println("public");
  }

  private void doSomething() {
    System.out.println("blabla");
  }
}
