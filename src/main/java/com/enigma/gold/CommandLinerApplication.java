package com.enigma.gold;

import com.enigma.gold.dao.ProductDao;
import com.enigma.gold.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLinerApplication implements CommandLineRunner {

    @Autowired
    ProductDao productDao;

    @Override
    public void run(String... args) throws Exception {

        Integer id = 1;
        System.out.println("GET FROM DB WITH ID " + id);
        System.out.println("=====================================");
        Product product = productDao.findProductByID(id);
        System.out.println(product);
        System.out.println("=====================================");

        System.out.println("=====================================");
        List<Product> productList = productDao.findAll();
        System.out.println(productList);
        System.out.println("=====================================");


    }
}
