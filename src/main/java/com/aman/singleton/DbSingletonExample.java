package com.aman.singleton;

public class DbSingletonExample {
  public static void main(String[] args) {
    DbSingleton dbSingleton = DbSingleton.getInstance();
    System.out.println(dbSingleton);
    DbSingleton anotherInstance = DbSingleton.getInstance();
    System.out.println(anotherInstance);
  }
}
