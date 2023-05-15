package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl  implements UserDao {

    public UserDaoJDBCImpl() {



    }

    public void createUsersTable() {
        try(Connection connection = Util.connectionIdbc();
            Statement statement = connection.createStatement()) {
            statement.execute("create table IF NOT EXISTS `pp_1_1_3-4_jdbc_hibernate`.`users`" +
                    "(`id`int not null auto_increment," + "`name` varchar(34)," + "`lastname` varchar(25),"
                    + "`age` tinyint(3)," + "primary key (id))");
            System.out.println("Таблица пользователей создана");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    public void dropUsersTable() {
        try (Connection connection = Util.connectionIdbc();
        Statement statement = connection.createStatement()){
            statement.executeUpdate("drop table IF EXISTS `pp_1_1_3-4_jdbc_hibernate`.`users`");
            System.out.println("Таблица пользователей удалена");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void saveUser(String name, String lastName, byte age) {
          try (Connection connection = Util.connectionIdbc();
               PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `pp_1_1_3-4_jdbc_hibernate`.users(name, lastname, age) VALUES (?, ?, ?)")){
              preparedStatement.setString(1, name);
              preparedStatement.setString(2, lastName);
              preparedStatement.setByte(3,age);
              preparedStatement.executeUpdate();

} catch (SQLException e) {
              throw new RuntimeException(e);
          }

    }



    public void removeUserById(long id) {
//        try (Connection connection = Util.connectionIdbc()){
//            try(PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
//                preparedStatement.setLong(1, id);
//                preparedStatement.executeUpdate();
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        try (Connection connection = Util.connectionIdbc();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")){
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
