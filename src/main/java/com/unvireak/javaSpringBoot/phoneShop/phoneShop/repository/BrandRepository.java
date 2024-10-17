package com.unvireak.javaSpringBoot.phoneShop.phoneShop.repository;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository <Brand, Integer>, JpaSpecificationExecutor {

    List<Brand> findByNameLike(String name);
}
