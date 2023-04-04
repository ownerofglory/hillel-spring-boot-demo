package ua.hillel.springbootdemo.service;

import ua.hillel.springbootdemo.model.entity.Product;

public interface ProductService {
    Product addProduct(Product product);
    Product getProductById(Long id);
}
