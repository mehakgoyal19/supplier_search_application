package repository;

import model.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends CrudRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, String nature_Of_Business, String manufacturing_Processes);
}