package com.unvireak.javaSpringBoot.phoneShop.phoneShop.controller;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.dto.BrandDTO;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.mapper.BrandMapper;
import com.unvireak.javaSpringBoot.phoneShop.phoneShop.service.BrandService;

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

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method=RequestMethod.POST)

   public ResponseEntity <?>  create(@RequestBody BrandDTO brandDTO){
//   Brand brand = Mapper.toBrand(brandDTO);
        Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
   brand = brandService.create(brand);
        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
    }

     @GetMapping("{id}")
        public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId){
            Brand brand = brandService.getById(brandId);
         return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
        }

         @PutMapping("{id}")
         public ResponseEntity<?> update(@PathVariable("id") Integer brandId, @RequestBody BrandDTO brandDTO){
//             Brand brand = Mapper.toBrand(brandDTO);
             Brand brand = BrandMapper.INSTANCE.toBrand(brandDTO);
             Brand updatedBrand = brandService.update(brandId, brand);
             return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(updatedBrand));

         }
    @GetMapping("filter")
    public ResponseEntity<?> getBrands(@RequestParam Map<String, String> params){
//     List<BrandDTO> list = brandService.getBrands(name)
//                .stream()
//                .map(brand -> BrandMapper.INSTANCE.toBrandDTO(brand))
//                .collect(Collectors.toList());
//        return ResponseEntity.ok(list);
//        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getBrands(String name){
        List<BrandDTO> list = brandService.getBrands(name)
                .stream()
                .map(brand -> BrandMapper.INSTANCE.toBrandDTO(brand))
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
//        return ResponseEntity.ok(BrandMapper.INSTANCE.toBrandDTO(brand));
    }

}
