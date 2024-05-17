package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain;

import java.util.Objects;
/*Domain Class : Doctor
Author: Liso Mantakana 222764600
 */
//@Entity
public class Inventory {

    private String productID;
    private int quantityAv;
    private Long location;
    private String supplierID;
    private double purchasePrice;

    protected Inventory() {
    }

    protected Inventory(Builder builder) {
        this.productID =builder.productID;
        this.quantityAv = builder.quantityAv;
        this.location =builder.location;
        this.supplierID = builder.supplierID;
        this.purchasePrice =builder.purchasePrice;
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantityAv() {
        return quantityAv;
    }

    public Long getLocation() {
        return location;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return quantityAv == inventory.quantityAv && Double.compare(purchasePrice, inventory.purchasePrice) == 0 && Objects.equals(productID, inventory.productID) && Objects.equals(location, inventory.location) && Objects.equals(supplierID, inventory.supplierID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, quantityAv, location, supplierID, purchasePrice);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productID='" + productID + '\'' +
                ", quantityAv=" + quantityAv +
                ", location=" + location +
                ", supplierID='" + supplierID + '\'' +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public static class Builder{
        private String productID;
        private int quantityAv;
        private Long location;
        private String supplierID;
        private double purchasePrice;

        public Builder setProductID(String productID) {
            this.productID = productID;
            return this;
        }

        public Builder setQuantityAv(int quantityAv) {
            this.quantityAv = quantityAv;
            return this;
        }

        public Builder setLocation(Long location) {
            this.location = location;
            return this;
        }

        public Builder setSupplierID(String supplierID) {
            this.supplierID = supplierID;
            return this;
        }

        public Builder setPurchasePrice(double purchasePrice) {
            this.purchasePrice = purchasePrice;
            return this;
        }

        public Builder copy(Inventory inv){
            this.productID = inv.productID;
            this.quantityAv = inv.quantityAv;;
            this.location = inv.location;;
            this.supplierID = inv.supplierID;
            this.purchasePrice = inv.purchasePrice;
            return this;

        }
        public Inventory build(){
            return new Inventory (this);
        }
    }
}
