package com.vishwa.gvani.service;

import com.vishwa.gvani.repository.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<String> getAllUsers();
}
