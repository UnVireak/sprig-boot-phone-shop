package com.unvireak.javaSpringBoot.phoneShop.phoneShop.repository;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository <Brand, Integer> {
}
