package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    List<Inventory> findByQuantityLessThan(int quantity);
}
