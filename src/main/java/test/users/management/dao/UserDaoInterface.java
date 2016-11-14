package test.users.management.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by igor on 12.11.2016.
 */
public interface UserDaoInterface<T, Id extends Serializable> {

    void persist(T users);

    void update(T users);

    T findById(int id);

    void delete(T users);

    List<T> findAll();

    List<T> findByNameOrSurname(String name, String surname);
}
