package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.factory;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Inventory;
//import ADP_Capstone_Project.za.ac.cput.adp_capstone_project.util.Helper;
public class InventoryFactory {

    public static Inventory buildInventory(String productID, int quantityAv, Long location, String supplierID, double purchasePrice){
        if(za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(productID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(quantityAv)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(location)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(supplierID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(purchasePrice)))
            return null;

        return new Inventory.Builder()
                .setProductID(productID)
                .setQuantityAv(quantityAv)
                .setLocation(location)
                .setSupplierID(supplierID)
                .setPurchasePrice(purchasePrice)
                .build();


    }
    public static Inventory buildInventory( int quantityAv, Long location, String supplierID, double purchasePrice){
        if(za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(quantityAv)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(location)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(supplierID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(purchasePrice)))
            return null;
        String productID = za.ac.cput.adp_capstone_project.util.Helper.generateId();

        return new Inventory.Builder()
                .setProductID(productID)
                .setQuantityAv(quantityAv)
                .setLocation(location)
                .setSupplierID(supplierID)
                .setPurchasePrice(purchasePrice)
                .build();
}
}