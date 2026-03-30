package com.krd.services;

import com.krd.entities.Category;
import com.krd.entities.User;
import com.krd.repositories.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRespository categoryRespository;

    public List<Category> findAll() {
        return categoryRespository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRespository.findById(id);
        return obj.get();
    }

}
