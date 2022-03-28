package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
      userService.saveUser("Vasya", "Semenov", (byte)25);
        userService.saveUser("Petya", "Vasin", (byte)27);
        userService.saveUser("Sasha", "Petrov", (byte)28);
        userService.saveUser("Lena", "Semenova", (byte)29);
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();

    }
}

