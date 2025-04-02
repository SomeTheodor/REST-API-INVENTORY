package services.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Inventory;
import entities.Product;

public interface InventoryService {
    List<Inventory> getAllInventory();
    Optional<Inventory> getInventoryById(Long id);
    Optional<Inventory> getInventoryByProduct(Product product);
    boolean hasStock(Long productId, int requestedQuantity);
    List<Inventory> getLowStockProducts(int limit);
    // List<Inventory> getInventoryUpdatesByUser(User user);
}
