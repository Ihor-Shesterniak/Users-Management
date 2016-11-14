package test.users.management.dao;


import org.springframework.stereotype.Repository;
import test.users.management.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by igor on 12.11.2016.
 */
@Repository
public class UserDao implements UserDaoInterface<User, Integer> {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDao() {
    }

    @Override
    public void persist(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public User findById(int id) {
        User user = (User) entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void delete(User users) {
        entityManager.remove(users);
    }

    @Override
    public List<User> findAll() {
        List<User> use = (List<User>) entityManager.createQuery("from User")
                .getResultList();
        return use;
    }

    @Override
    public List<User> findByNameOrSurname(String name, String surname) {
        return entityManager.createQuery("select u from User u where u.firstName = :name or u.lastName = :surname")
                .setParameter("name", name)
                .setParameter("surname", surname)
                .getResultList();
    }
}
