package com.untilspring.startspring;

import com.untilspring.startspring.models.Product;
import com.untilspring.startspring.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Dataseeder implements CommandLineRunner {

    @Autowired
    private Productrepository productrepository;

    public Dataseeder(Productrepository productrepository) {
        this.productrepository = productrepository;
    }

    @Override
    public void run(String ...args) throws Exception{

        if(productrepository.count() == 0){
            List<Product> products = Arrays.asList(
                    new Product("oppo",2343.44,"high config",4.5,"F5","vignesh",8999,1000,Arrays.asList("https://picsum.photos/200/300")));
            productrepository.saveAll(products);
            System.out.println("sample data sended ");
        }
    }
}
