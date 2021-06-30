package com.vdab.shopper.services;

import com.vdab.shopper.domain.User;
import com.vdab.shopper.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Get All Users
    public List<User> findAll(){
        return userRepository.findAll();
    }

    //Get User By Id
    public Optional<User> findById(int id) {
        return (Optional<User>) userRepository.findById(id);
    }

    //Delete User
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    //Update User
    public void update(int id, String foodName) {
        userRepository.update(id, foodName);
    }

    public void save(User newUser) {
        userRepository.save(newUser);
    }


}


