package services.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id,Category category);
    void deleteCategory(Long id);
    Optional<Category> getCategoryByName(String name);
}
