package services.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id,Product product);
    void deleteProduct(Long id);
    Optional<Product> getProductByName(String name);
    List<Product> getProductsByCategory(String categoryName);
    List<Product> getLowStockProducts(int limit);
}
