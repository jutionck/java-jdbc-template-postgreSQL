package com.enigma.gold.mapper;

import com.enigma.gold.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setProductName(resultSet.getString("product_name"));
        product.setProductPrice(resultSet.getInt("price"));
        return product;
    }
}
