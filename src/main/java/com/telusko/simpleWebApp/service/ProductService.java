package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// write business logic in service.
// controller just get from here
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // hardcoded
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iPhone", 1250),
//            new Product(102, "Nokia", 112),
//            new Product(103, "Shure dynamic mic", 699)
//    ));

    // get all
    public List<Product> getProducts() {
//        return products; // hardcoded
        return repo.findAll();
    }

    // get 1
    public Product getProductById(int prodId) {
        // hardcoded
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
////                .findFirst().get(); // give u first one
//                // if don't find, default to this
//                .findFirst().orElse(new Product(100, "No item", 0));

        // get id if exist, else a blank product
        // this returns optional
        return repo.findById(prodId).orElse(new Product());
    }

    // add 1
    public void addProduct(Product prod) {
        // hardcoded
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        // updated
//        int index = 0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId()) {
//                index = i;
//            }
//        }
//        products.set(index, prod);

        // will check if data is there, if there, update, else will create new
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        // hardcoded
//        int index = 0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId() == prodId) {
//                index = i;
//            }
//        }
//        products.remove(index);

        repo.deleteById(prodId) ;
    }
}
