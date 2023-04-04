package ua.hillel.springbootdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.hillel.springbootdemo.model.entity.Product;
import ua.hillel.springbootdemo.service.ProductService;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        Product productById = productService.getProductById(id);

        return ResponseEntity.ok(productById);
    }

    @PostMapping
    public @ResponseBody
    ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product created = productService.addProduct(product);

        return ResponseEntity.ok(created);
    }
}
