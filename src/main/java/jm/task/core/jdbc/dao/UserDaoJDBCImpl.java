package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
//    private Object connection;
//
//    public UserDaoJDBCImpl() {
//
//
//    }
//
//    public void createUsersTable(User user, Connection connection) throws SQLException {
//        PreparedStatement preparedStatement = connection.prepareStatement(
//                "INSERT INTO users (id,name,lastName,age) VALUES (?, ?, ?,)"
//        );
//        preparedStatement.setLong(1, user.getId());
//        preparedStatement.setString(2, user.getName());
//        preparedStatement.setString(3, user.getLastName());
//        preparedStatement.setByte(4, user.getAge());
//        preparedStatement.executeUpdate();
//    }
//// Данный метод `createUsersTable` служит для создания записей в таблице базы данных `users` с помощью переданного объекта пользователя (User) и подключения к БД (Connection).
////  Он использует подготовленный запрос (PreparedStatement) для вставки значений в таблицу. Подготовленный запрос позволяет предварительно компилировать запрос SQL и создавать объект, который можно использовать для многократных выполнений запросов с различными параметрами.
//    @Override
//    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name ALEX(255), last_name ALEX(255), age INT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//    }
//
//    public void dropUsersTable() {
//
//    }
//
//   // public void saveUser(String name, String lastName, byte age) {
//
//    }
//
//    public void removeUserById(long id) {
//
//    }
//
//    public List<User> getAllUsers() {
//        return null;
//    }
////    try (Connection con = createConnection()) {
////    con.setAutoCommit(false);
////    try  {
////        // здесь всё делаешь
////    } catch(SQLException ex) {
////        con.rollback(); // в скоупе, поэтому ок
//
//
//    public void cleanUsersTable() {
//
//    }
//}
//}
