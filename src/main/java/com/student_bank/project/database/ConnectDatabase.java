package com.student_bank.project.database;
import java.sql.*;
import java.sql.Connection;
import java.util.Properties;

import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.factory.StudentFactory;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConnectDatabase {

  private static Connection connection = null;
  public static ConnectDatabase databaseInstance = null;
  IStudentFactory ifactory = new StudentFactory();

  private ConnectDatabase() {
    createConnection();
  }

  void createConnection() {
    try {
      Properties props = ifactory.makeProperties();
      InputStream fileInput = ifactory.makeFileInputStream("src/main/java/com/student_bank/project/database/dbConfig.properties");
      props.load(fileInput);
      String databaseEnviorment = props.getProperty("DB_ENVIRONMENT");
      System.out.println("\n\n\n\n"+databaseEnviorment);
      String env = System.getProperty("APP_ENV", databaseEnviorment);

      if (env.equalsIgnoreCase("prod")) {
        getProductionEnvironment(props);

      } else if (env.equalsIgnoreCase("test")) {
        getTestEnvironment(props);

      } else {
        getDevEnvironment(props);
        
      }
     
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void checkConnection(Connection connection){
      if (connection != null) {
        System.out.println("Connection with db successful!");
      }
  }

  public Connection getTestEnvironment(Properties properties) throws FileNotFoundException, SQLException {
      String baseUrl =properties.getProperty("DB_URL") +properties.getProperty("TEST_HOST") +":" + properties.getProperty("TEST_PORT") +"/";
      String url = baseUrl + properties.getProperty("TEST_NAME");
      String username = properties.getProperty("TEST_USERNAME");
      String password = properties.getProperty("TEST_PASSWORD");
      connection = DriverManager.getConnection(url, username, password);
      checkConnection(connection);
      return connection;
  }
  public Connection getProductionEnvironment(Properties properties) throws FileNotFoundException, SQLException {
    String baseUrl =properties.getProperty("DB_URL") +properties.getProperty("PROD_HOST") +":" + properties.getProperty("PROD_PORT") +"/";
    String url = baseUrl + properties.getProperty("PROD_NAME");
    String username = properties.getProperty("PROD_USERNAME");
    String password = properties.getProperty("PROD_PASSWORD");
    connection = DriverManager.getConnection(url, username, password);
    checkConnection(connection);
    return connection;
  }
  public Connection getDevEnvironment(Properties properties) throws FileNotFoundException, SQLException {
    String baseUrl =properties.getProperty("DB_URL") +properties.getProperty("DEV_HOST") +":" + properties.getProperty("DEV_PORT") +"/";
    String url = baseUrl + properties.getProperty("DEV_NAME");
    String username = properties.getProperty("DEV_USERNAME");
    String password = properties.getProperty("DEV_PASSWORD");
    connection = DriverManager.getConnection(url, username, password);
    checkConnection(connection);
    return connection;
  }

  public static  ConnectDatabase getInstance(){
    if(connection == null){
      databaseInstance = new ConnectDatabase();

    }
    return databaseInstance;
  }

  public Connection getConnection() {
    return connection;
  }

  public void closeConnection() {
    try {
      if (connection != null) {
        connection.close();
      }
    } catch (Exception e) {
      connection = null;
    }
  }
}
