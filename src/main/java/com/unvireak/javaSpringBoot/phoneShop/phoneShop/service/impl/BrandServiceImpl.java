package com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.impl;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.exception.ResourceNotFoundException;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.repository.BrandRepository;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.BrandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;


    @Override
    public Brand create(Brand brand) {
        return  brandRepository.save(brand);

    }


      @Override
    public Brand getById(Integer id) {
            return brandRepository.findById(id)
                    // .orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND, "Brand with id = %d not found!".formatted(id)));
                    .orElseThrow(()-> new ResourceNotFoundException("Brand",id));
                }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {
        Brand brand = getById(id);
        brand.setName(brand.getName());
        return brandRepository.save(brand);
    }



}
