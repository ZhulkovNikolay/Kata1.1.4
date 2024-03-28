package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private final static String URL = "jdbc:mysql://localhost:3306/usersdb";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private Connection connection = null;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Подключение к БД установлено!");
            }
        } catch (SQLException e) {
            System.err.println("Не удалось загрузить класс драйвера");
            e.printStackTrace();
        }
        return connection;
    }

}
