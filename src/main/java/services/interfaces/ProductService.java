package services.interfaces;

import java.util.List;
import entities.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id,Product product);
    void deleteProduct(Long id);
    List<Product> getProductByName(String name);
    List<Product> getProductsByCategory(String categoryName);
    List<Product> getStockProducts(int limit);
}
