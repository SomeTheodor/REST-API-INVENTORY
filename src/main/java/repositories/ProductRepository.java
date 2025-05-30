package repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByStock(int limit);
}
