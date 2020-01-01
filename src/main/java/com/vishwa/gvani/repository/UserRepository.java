package com.vishwa.gvani.repository;

import com.vishwa.gvani.repository.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer> {
}
