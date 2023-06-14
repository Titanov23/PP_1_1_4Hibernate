package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util { // реализуйте настройку соеденения с БД


    protected static final String URL = "jdbc:mysql://localhost:3306/pp_1_1_4hibernate";
    protected static final String LOGIN = "root";
    protected static final String PASSWORD = "mysq77";

    private static Connection connection; //J
    private static SessionFactory sessionFactory;


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

    public static SessionFactory openSessionFactory() {
        if (sessionFactory == null || sessionFactory.isClosed()) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, URL);
                properties.put(Environment.USER, LOGIN);
                properties.put(Environment.PASS, PASSWORD);
                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                properties.put(Environment.SHOW_SQL, "false");
                properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                properties.put(Environment.HBM2DDL_AUTO, "update");
                configuration.setProperties(properties);
                // configuration.setProperties(properties);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();


                sessionFactory = configuration.buildSessionFactory(serviceRegistry);


            } catch (Exception e) {
                System.out.println("Не удалось подключиться к БД");
                e.printStackTrace();
            }


        }

        return sessionFactory;
    }
}
                
            
              


    

