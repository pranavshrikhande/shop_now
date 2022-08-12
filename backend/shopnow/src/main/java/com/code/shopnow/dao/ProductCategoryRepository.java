package com.code.shopnow.dao;

import com.code.shopnow.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/*
 * productCategory------------>JSON ENTRY
 * 
 * */
@RepositoryRestResource(collectionResourceRel="productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
