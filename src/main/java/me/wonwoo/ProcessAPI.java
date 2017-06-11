package me.wonwoo;

/**
 * Created by wonwoolee on 2017. 6. 11..
 */
public class ProcessAPI {

  public static void main(String[] args) {
    ProcessHandle processHandle = ProcessHandle.current();
    ProcessHandle.Info processInfo = processHandle.info();
    long pid = processHandle.pid();
    System.out.println(pid);
    System.out.println(processInfo.command().get());
    System.out.println(processInfo.startInstant().isPresent());
    System.out.println(processInfo.totalCpuDuration().isPresent());
  }
}
