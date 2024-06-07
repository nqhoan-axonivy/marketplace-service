package com.axonivy.market.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.axonivy.market.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

  Page<Product> findByType(String type, Pageable pageable);

  Product findByLogoUrl(String logoUrl);

  @Query(value = "{'marketDirectory': {$regex : ?0, $options: 'i'}}")
  Product findByMarketDirectoryRegex(String search);

  @Query("{ $or: [ { 'name' : { $regex: ?0, $options: 'i' } }, { 'shortDescription' : { $regex: ?0, $options: 'i' } } ] }")
  Page<Product> findByNameOrShortDescriptionRegex(String keyword, Pageable unifiedPageabe);
}