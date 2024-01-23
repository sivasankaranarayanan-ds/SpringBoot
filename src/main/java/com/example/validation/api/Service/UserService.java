package com.example.validation.api.Service;

import com.example.validation.api.DTO.UserRequest;
import com.example.validation.api.Entity.User;
import com.example.validation.api.Exception.UserNotFoundException;
import com.example.validation.api.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;

    public User saveUser(UserRequest userRequest)
    {
        User user=User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepo.findByUserId(id);
        if(user!=null)
        {
            return user;
        }
        else {
            throw new UserNotFoundException("user not found with id: " + id);
        }
    }
}
