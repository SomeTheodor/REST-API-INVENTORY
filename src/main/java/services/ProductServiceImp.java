package services;

import java.util.List;
import java.util.Optional;
import entities.Product;
import jakarta.persistence.EntityNotFoundException;
import repositories.ProductRepository;
import services.interfaces.ProductService;

public class ProductServiceImp implements ProductService{

    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
        
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getStockProducts(int limit) {
        return productRepository.findByStock(limit);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Product> getProductsByCategory(String categoryName) {
        return productRepository.findByNameContainingIgnoreCase(categoryName);
    }

    @Override
    public Product updateProduct(Long id, Product productUpdated) {
        Product product = getProductById(id);
        product.setDescription(productUpdated.getDescription());
        product.setName(productUpdated.getName());
        product.setCategory(productUpdated.getCategory());
        product.setPrice(productUpdated.getPrice());
        product.setSupplier(productUpdated.getSupplier());
        return productRepository.save(product);
    }    
}
