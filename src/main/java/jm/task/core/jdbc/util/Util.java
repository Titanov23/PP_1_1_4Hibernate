package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util { // реализуйте настройку соеденения с БД
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost/testdb"; // URL базы данных
        String username = "username"; // Имя пользователя базы данных
        String password = "password"; // Пароль пользователя базы данных

        Connection connection = null;

        try {
            // Подключение драйвера JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Создаем соединение с базой данных и возвращаем его
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.err.println("Не найден класс драйвера");
        }

        return connection;
    }

}
