package com.untilspring.startspring.services;

import com.untilspring.startspring.models.Product;
import com.untilspring.startspring.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Productservices {
   @Autowired
    private Productrepository productrepository;

     public List<Product> getAllProducts(){
         return productrepository.findAll();
     }
}
