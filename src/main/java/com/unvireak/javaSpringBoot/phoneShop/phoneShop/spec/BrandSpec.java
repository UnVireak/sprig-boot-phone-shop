package com.unvireak.javaSpringBoot.phoneShop.phoneShop.spec;

import com.unvireak.javaSpringBoot.phoneShop.phoneShop.entity.Brand;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

@Data
public class BrandSpec implements Specification<Brand> {


    private final  BrandFilter brandFilter;
    @Override
    public Predicate toPredicate(Root<Brand> brand, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return null;
    }
}
