package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;


import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao usDaoHib = new UserDaoHibernateImpl();

    public void createUsersTable() {
        usDaoHib.createUsersTable();
    }

    public void dropUsersTable() {
        usDaoHib.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        usDaoHib.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        usDaoHib.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return usDaoHib.getAllUsers();

    }

    public void cleanUsersTable() {
//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.cleanUsersTable();

        usDaoHib.cleanUsersTable();

    }
}
