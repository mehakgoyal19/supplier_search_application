package controller;
import model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SupplierService;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String nature_Of_Business,
            @RequestParam String manufacturing_Processes,
            @RequestParam int limit) {

        List<Supplier> suppliers = supplierService.findSuppliers(location, nature_Of_Business, manufacturing_Processes, limit);
        return ResponseEntity.ok(suppliers);
    }
}
