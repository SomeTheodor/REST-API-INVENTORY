package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    //next add more querys to find by names, etc.
    List<Inventory> findByQuantityLessThan(int quantity);
}
