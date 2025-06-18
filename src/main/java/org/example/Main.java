package org.example;

import org.example.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();
        System.out.println("Таблица пользователей создана");

        userDao.cleanUsersTable();

        userDao.saveUser("Vasya", "Pupkin", (byte) 22);
        userDao.saveUser("Anna", "Petrova", (byte) 47);
        userDao.saveUser("Georgiy", "Tarakanov", (byte) 31);
        userDao.saveUser("Masha", "Kozlova", (byte) 15);

        System.out.println(userDao.getAllUsers());

        userDao.dropUsersTable();
        }
    }