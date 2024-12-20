package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// don't write business logic in controller
// ask from service
@RestController
public class ProductController {

    // connect to service
    @Autowired
    ProductService service;

    // Controller gets data from Service layer
    // get all
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // get 1
    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // create 1
    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(">>> created successfully >>> " + prod);
        service.addProduct(prod);
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct(@RequestBody Product prod) {
        System.out.println(">>> updated successfully >>> " + prod);
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        System.out.println(">>> deleted successfully >>> ");
        service.deleteProduct(prodId);
    }
}
// access DB
//http://localhost:8080/h2-console