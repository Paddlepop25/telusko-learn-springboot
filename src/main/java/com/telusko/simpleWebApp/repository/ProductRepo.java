package com.telusko.simpleWebApp.repository;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <ClassWorkingWith, PrimaryKeyType (would be id type)>
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


}
