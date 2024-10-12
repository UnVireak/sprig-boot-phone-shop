package com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.util;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.dto.BrandDTO;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;

public class Mapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        // brand.setId(dto.getId());
        brand.setName(dto.getName());
        return brand;
    }
    public static BrandDTO toBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        // brand.setId(dto.getId());
        brandDTO.setName(brand.getName());
        return brandDTO                                                                                                                                   ;
    }
}
