package model;

import javax.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplier_Id;
    private String company_Name;
    private String website;
    private String location;
    private String nature_Of_Business;
    private String manufacturing_Processes;

    public Long getSupplier_Id() {
        return supplier_Id;
    }

    public void setSupplier_Id(Long supplier_Id) {
        this.supplier_Id = supplier_Id;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNature_Of_Business() {
        return nature_Of_Business;
    }

    public void setNature_Of_Business(String nature_Of_Business) {
        this.nature_Of_Business = nature_Of_Business;
    }

    public String getManufacturing_Processes() {
        return manufacturing_Processes;
    }

    public void setManufacturing_Processes(String manufacturing_Processes) {
        this.manufacturing_Processes = manufacturing_Processes;
    }
}