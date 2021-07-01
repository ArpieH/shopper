package com.vdab.shopper.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository<User, Integer> {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        return (List<User>) entityManager.createQuery("SELECT u from User u", com.vdab.shopper.domain.User.class).getResultList();
    }

    public void deleteById(int id) {

    }

    public void update(int id, String foodName) {

    }



    public User findById(int id) {
        return (User) entityManager.find(com.vdab.shopper.domain.User.class, id);

    }
    @Transactional
    public void save(User newUser) {
        entityManager.persist(newUser);
    }
}
