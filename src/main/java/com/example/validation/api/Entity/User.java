package com.example.validation.api.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="USERS_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User
{
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private long mobile;
    private String gender;
    private int age;
    private String nationality;
}
