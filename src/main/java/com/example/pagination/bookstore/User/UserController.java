package com.example.pagination.bookstore.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/api/users")
    Page<User> getUsers(Pageable page)
    {
        return userService.getUsers(page);
    }

}
