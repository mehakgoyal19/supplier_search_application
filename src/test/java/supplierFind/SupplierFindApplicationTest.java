package supplierFind;

import model.Supplier;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import repository.SupplierRepo;
import service.SupplierService;

import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class SupplierFindApplicationTest {

    @Mock
    private SupplierRepo supplierRepo;

    @InjectMocks
    private SupplierService supplierService;

    @Test
    void testFindSuppliers() {
        MockitoAnnotations.openMocks(this); // Initialize mocks

        Supplier supplier = new Supplier();
        supplier.setCompany_Name("Example Co");
        supplier.setWebsite("http://example.com");
        supplier.setLocation("India");
        supplier.setNature_Of_Business("small_scale");
        supplier.setManufacturing_Processes("3d_printing");

        // Mock repository behavior
        when(supplierRepo.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining("India", "small_scale", "3d_printing"))
                .thenReturn(Collections.singletonList(supplier));

        List<Supplier> suppliers = supplierService.findSuppliers("India", "small_scale", "3d_printing", 10);
        assertEquals(1, suppliers.size());
        assertEquals("Example Co", suppliers.get(0).getCompany_Name());
    }
}