package service;
import model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SupplierRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    public SupplierService(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }

    public List<Supplier> findSuppliers(String location, String nature_Of_Business, String manufacturing_Processes, int limit) {
        return supplierRepo
                .findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location, nature_Of_Business, manufacturing_Processes)
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }
}