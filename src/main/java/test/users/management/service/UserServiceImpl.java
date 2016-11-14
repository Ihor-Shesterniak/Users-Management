package test.users.management.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.users.management.dao.UserDao;
import test.users.management.model.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by igor on 12.11.2016.
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional
    public User create(User user) {
        User createdUser = user;

        userDao.persist(createdUser);
        return createdUser;
    }

    @Override
    @Transactional
    public User delete(int id) {
        User deletedUser = userDao.findById(id);
        userDao.delete(deletedUser);
        return deletedUser;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public User update(User user) {
        User updatedUser = userDao.findById(user.getId());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setAge(user.getAge());
        updatedUser.setAdmin(user.getAdmin());
        updatedUser.setCreatedDate(user.getCreatedDate());
        return updatedUser;
    }

    @Override
    @Transactional
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public List<User> search(String s) {
        return userDao.findByNameOrSurname(s, s);
    }
}
