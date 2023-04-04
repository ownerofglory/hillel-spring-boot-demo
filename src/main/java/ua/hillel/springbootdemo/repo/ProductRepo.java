package ua.hillel.springbootdemo.repo;

import ua.hillel.springbootdemo.model.entity.Product;

public interface ProductRepo {
    Product add(Product product);
    Product findById(Long id);
}
