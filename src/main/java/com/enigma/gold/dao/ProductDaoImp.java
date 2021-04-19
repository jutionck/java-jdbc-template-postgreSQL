package com.enigma.gold.dao;

import com.enigma.gold.entity.Product;
import com.enigma.gold.mapper.ProductRowMapper;
import com.enigma.gold.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImp implements ProductDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Product findProductByID(Integer id) {
        String sql = Query.SELECT_PRODUCT_BY_ID;
        return jdbcTemplate.queryForObject(sql, new ProductRowMapper(), id);
    }

    @Override
    public List<Product> findAll() {
        String sql = Query.SELECT_PRODUCT;
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }

    public Product findProductByID(Integer id, String productName) {
        String sql = Query.SELECT_PRODUCT_BY_ID_NAME;
        return jdbcTemplate.queryForObject(sql, new ProductRowMapper(), productName, id);
    }
}
