package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// write business logic in service.
// controller just get from here
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 1250),
            new Product(102, "Nokia", 112),
            new Product(103, "Shure dynamic mic", 699)
    ));

    // get all
    public List<Product> getProducts() {
        return products;
    }

    // get 1
    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
//                .findFirst().get(); // give u first one
                // if don't find, default to this
                .findFirst().orElse(new Product(100, "No item", 0));
    }

    // add 1
    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void putProduct(Product prod) {
        int index = 0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }
        }
        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }
}
