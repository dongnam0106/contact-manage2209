package service.impl;

import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CategoryRepository;
import service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }
}
