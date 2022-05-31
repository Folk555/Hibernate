package org.example;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDao();

    public UserService() {
    }

    public Owner findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(Owner owner) {
        usersDao.save(owner);
    }

    public void deleteUser(Owner owner) {
        usersDao.delete(owner);
    }

    public void updateUser(Owner owner) {
        usersDao.update(owner);
    }

    public List<Owner> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}