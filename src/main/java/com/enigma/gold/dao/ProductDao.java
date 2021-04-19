package com.enigma.gold.dao;

import com.enigma.gold.entity.Product;

import java.util.List;

public interface ProductDao {

    Product findProductByID(Integer id);

    List<Product> findAll();
}
