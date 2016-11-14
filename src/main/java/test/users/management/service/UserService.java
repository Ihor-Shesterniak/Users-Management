package test.users.management.service;

import test.users.management.model.User;

import java.util.List;

/**
 * Created by igor on 12.11.2016.
 */
public interface UserService {

    public User create(User user);

    public User delete(int id);

    public List<User> findAll();

    public User update(User user);

    public User findById(int id);

    public List<User> search(String s);
}
