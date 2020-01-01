package com.vishwa.gvani.service.impl;

import com.vishwa.gvani.repository.UserRepository;
import com.vishwa.gvani.repository.model.User;
import com.vishwa.gvani.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository ;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<String> getAllUsers() {
        List<String> usersNames=new ArrayList<>();
        Iterable<User> all = userRepository.findAll();
        all.forEach(user->{
            usersNames.add(user.getName());
        });

        return usersNames;
    }
}
