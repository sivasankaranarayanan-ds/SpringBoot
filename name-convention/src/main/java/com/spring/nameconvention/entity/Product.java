package com.spring.nameconvention.entity;

import com.spring.nameconvention.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Variable Name Convention start with small letter
    //It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
    //If the name contains multiple words, start it with the lowercase letter followed
    //by an uppercase letter such as firstName, lastName.
    //Avoid using one-character variables such as x, y, z.
    private Long id;
    private String name;
    private Double price;

    public Product(ProductDTO productDTO) {
    }

    //Constructor Name same as Class Name and append to the parentheses()
    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
