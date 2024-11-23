package com.yash.enotes_upgrade.service;

import com.yash.enotes_upgrade.entity.Category;
import com.yash.enotes_upgrade.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository catRepo;

    public CategoryServiceImpl(CategoryRepository catRepo) {
        this.catRepo = catRepo;
    }


    @Override
    public Category saveCategory(Category category) {
        category.setCreatedBy(1);
        category.setActive(true);
        category.setDeleted(false);
        category.setCreatedDate(new Date());
        return catRepo.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return catRepo.findAll();
    }
}
