package com.yash.enotes_upgrade;

import com.yash.enotes_upgrade.entity.Category;
import com.yash.enotes_upgrade.repository.CategoryRepository;
import com.yash.enotes_upgrade.service.CategoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EnotesUpgradeApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(EnotesUpgradeApplication.class, args);
		CategoryService service = (CategoryService) ctx.getBean("categoryServiceImpl");
		Category cat = new Category();
		cat.setName("cat");
		cat.setDescription("cat");
		service.saveCategory(cat);
	}

}
