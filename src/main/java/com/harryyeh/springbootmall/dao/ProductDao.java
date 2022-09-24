package com.harryyeh.springbootmall.dao;

import com.harryyeh.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

}
