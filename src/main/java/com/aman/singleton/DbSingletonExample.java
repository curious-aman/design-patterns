package com.aman.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonExample {
  public static void main(String[] args) {
    long timeBefore = 0;
    long timeAfter = 0;
    DbSingleton dbSingleton = DbSingleton.getInstance();
    timeBefore = System.currentTimeMillis();
    Connection conn = dbSingleton.getConnection();
    timeAfter = System.currentTimeMillis();
    System.out.println(timeAfter - timeBefore);
    try (Statement sta = conn.createStatement()) {
      int count =
          sta.executeUpdate(
              "CREATE TABLE Address(ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
      System.out.println("Table Created.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    timeBefore = System.currentTimeMillis();
    conn = dbSingleton.getConnection();
    timeAfter = System.currentTimeMillis();
    System.out.println(timeAfter - timeBefore);
  }
}
