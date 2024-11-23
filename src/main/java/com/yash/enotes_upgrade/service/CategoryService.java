package com.yash.enotes_upgrade.service;

import com.yash.enotes_upgrade.entity.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> getAllCategories();
}
