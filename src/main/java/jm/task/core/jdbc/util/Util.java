package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util { // реализуйте настройку соеденения с БД


        private static final String URL = "jdbc:mysql://localhost:3306/pp_1_1_3-4_jdbc_hibernate";
        private static final String LOGIN = "root";
        private static final String PASSWORD = "mysq77";

        private static Connection connection; //JDBC



        public static Connection connectionIdbc() {  //  соединение с базой данных
            try {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
                }
            } catch (SQLException e) {
                System.out.println("Не удалось подключиться к БД");
                e.printStackTrace();
            }

            return connection;
        }



    }
//    private static final String URL = "jdbs:mysql://localhost:3306/new_schema";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "mysq77";
//
//    public static void main(String[] args) {
//
//        Connection connection;
//        try {
//            Driver driver = new FabticMySQLDriver();
//            DriverManager.registerDriver(driver);
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            if(!connection.isClosed()){
//                System.out.println("Соеденение с Бд установлено");
//            }
//        } catch (SQLException e) {
//            System.out.println("Не удалось загрузить драйвер");
//        }
//
//
//
