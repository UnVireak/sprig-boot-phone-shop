package com.unvireak.javaSpringBoot.phoneShop.phoneShop.controller;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.dto.BrandDTO;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.BrandService;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.util.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method=RequestMethod.POST)
   
    
   public ResponseEntity <?>  create(@RequestBody BrandDTO brandDTO){
   Brand brand = Mapper.toBrand(brandDTO);
   brand = brandService.create(brand);
        return ResponseEntity.ok(brand);
    }

     @GetMapping("{id}")
        public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId){
            Brand brand = brandService.getById(brandId);
            return ResponseEntity.ok(brand);
        }

         @PutMapping("{id}")
         public ResponseEntity<?> update(@PathVariable("id") Integer brandId, @RequestBody BrandDTO brandDTO){
             Brand brand = Mapper.toBrand(brandDTO);
             Brand updatedBrand = brandService.update(brandId, brand);
             return ResponseEntity.ok(updatedBrand);
         }

}
