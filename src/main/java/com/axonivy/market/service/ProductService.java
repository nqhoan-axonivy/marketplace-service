package com.axonivy.market.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.axonivy.market.entity.Product;

public interface ProductService {
  Page<Product> findProductsByType(String type, Pageable pageable);

  Page<Product> searchProducts(String keyword, Pageable pageable);
}