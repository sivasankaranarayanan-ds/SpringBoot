package com.example.validation.api.Repo;

import com.example.validation.api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>
{

    User findByUserId(int id);
}
