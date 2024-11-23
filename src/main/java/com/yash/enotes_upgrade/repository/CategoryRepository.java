package com.yash.enotes_upgrade.repository;

import com.yash.enotes_upgrade.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
