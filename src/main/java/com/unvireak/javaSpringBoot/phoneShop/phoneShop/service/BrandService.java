package com.unvireak.javaSpringBoot.phoneShop.phoneShop.service;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public interface BrandService {
   Brand create(Brand brand);
   Brand getById(Integer id);
   Brand update(Integer id,Brand brandUpdate);
   List<Brand> getBrands(String name);
   List<Brand> getBrands(Map<String, String> params);
}
