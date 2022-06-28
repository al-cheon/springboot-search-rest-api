package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
