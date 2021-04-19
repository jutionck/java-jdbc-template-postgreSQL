package com.enigma.gold.utils;

public class Query {

    public final static String SELECT_PRODUCT = "SELECT id,product_name,price FROM m_product";
    public final static String SELECT_PRODUCT_BY_ID = "SELECT * FROM m_product WHERE id = ?";
    public final static String SELECT_PRODUCT_BY_ID_NAME = "SELECT * FROM m_product WHERE product_name = ? AND id = ?";
}
