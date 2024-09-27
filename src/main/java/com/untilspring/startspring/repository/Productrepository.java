package com.untilspring.startspring.repository;

import com.untilspring.startspring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product,Long> {

}
