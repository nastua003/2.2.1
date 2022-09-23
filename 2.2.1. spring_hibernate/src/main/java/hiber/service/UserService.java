package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    void addUser(User user);

    List<User> listUsersByCar(String renault, int i);
}
