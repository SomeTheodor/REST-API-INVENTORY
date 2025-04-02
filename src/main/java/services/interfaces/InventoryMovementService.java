package services.interfaces;

import java.util.List;
import java.util.Optional;

import entities.InventoryMovement;
import entities.enums.MovementType;

public interface InventoryMovementService {
    List<InventoryMovement> getAllMovements();
    Optional<InventoryMovement> getMovementById(Long id);
    InventoryMovement createMovement(InventoryMovement movement);
    void deleteMovement(Long id);  
    List<InventoryMovement> getMovementsByProduct(Long productId);
    //List<InventoryMovement> getMovementsBetweenDates(LocalDateTime startDate, LocalDateTime endDate);
    List<InventoryMovement> getMovementsByType(MovementType type);
}

