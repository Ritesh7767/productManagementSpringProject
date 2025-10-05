package com.ritesh.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    @Size(min = 2, max = 10, message = "Name of the product should be in range 2 to 10")
    private String name;

    @Column(name = "brand", nullable = false)
    @Size(min = 2, max = 10, message = "Name of the product should be in range 2 to 10")
    private String brand;

    @Column(name = "price", nullable = false)
    @NotNull(message = "Price cannot be null")
    private Double price;

}
