package com.unvireak.javaSpringBoot.phoneShop.phoneShop.service;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;


public interface BrandService {
   Brand create(Brand brand);
   Brand getById(Integer id);
   Brand update(Integer id,Brand brandUpdate);
}
