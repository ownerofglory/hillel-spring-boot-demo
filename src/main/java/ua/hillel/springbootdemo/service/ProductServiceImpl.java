package ua.hillel.springbootdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.hillel.springbootdemo.model.entity.Product;
import ua.hillel.springbootdemo.repo.ProductRepo;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService  {
    private final ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        return productRepo.add(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id);
    }
}
