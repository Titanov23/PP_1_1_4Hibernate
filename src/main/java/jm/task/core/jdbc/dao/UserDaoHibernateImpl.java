package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import javax.security.auth.login.Configuration;
import java.util.EnumSet;
import java.util.List;

import static jm.task.core.jdbc.util.Util.openSessionFactory;

public class UserDaoHibernateImpl implements UserDao {
    private Transaction transaction = null;

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        try (Session session = openSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.createNativeQuery("CREATE TABLE IF NOT EXISTS user " +
                    "(id INT NOT NULL AUTO_INCREMENT," +
                    "name VARCHAR(45)," +
                    "lastName VARCHAR(45)," +
                    "age TINYINT(3)," +
                    "PRIMARY KEY (id))").executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        }

    }

    @Override
    public void dropUsersTable() {
//        try (Session session = Util.openSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.createNativeQuery("DROP TABLE IF EXISTS user").executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }



    @Override
    public void saveUser(String name, String lastName, byte age) {
//        Session session = Util.openSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.save(new User(name, lastName, age));
//            transaction.commit();
//            session.close();

    }

    @Override
    public void removeUserById(long id) {
//        Transaction transaction = null;
//        try (Session session = Util.openSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            User user = session.get(User.class, id);
//            if (user != null) {
//                session.delete(user);
//            } else {
//                System.out.println("User is not found");
//            }
//            transaction.commit();
//        } catch (HibernateException e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
    }

    @Override
    public List<User> getAllUsers() {
//        try (Session session = Util.openSessionFactory().openSession()) {
//
//
//            return session.createQuery("FROM User ", User.class).list();
//        }
      return null;

    }

    @Override
    public void cleanUsersTable() {
//        try (Session session = Util.openSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.createQuery("DELETE FROM User").executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
