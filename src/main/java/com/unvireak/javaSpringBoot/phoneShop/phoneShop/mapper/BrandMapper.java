package com.unvireak.javaSpringBoot.phoneShop.phoneShop.mapper;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.dto.BrandDTO;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    Brand toBrand(BrandDTO dto);

    BrandDTO toBrandDTO(Brand entity);
}
