package com.spring.nameconvention.dto;

import lombok.*;

@Setter
@Getter
@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
}

