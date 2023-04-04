package ua.hillel.springbootdemo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "t_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
