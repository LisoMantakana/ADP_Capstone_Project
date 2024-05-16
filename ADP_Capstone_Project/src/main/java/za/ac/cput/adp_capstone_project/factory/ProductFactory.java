package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.Product;
import za.ac.cput.adp_capstone_project.util.Helper;

public class ProductFactory {

    public static Product buildProduct(String productID, String hairTexture, String hairStyle, String hairSize,
                                       String hairColor, boolean hairStock, double hairPrice) {
        if (Helper.isNullOrEmpty(productID) || Helper.isNullOrEmpty(hairTexture) || Helper.isNullOrEmpty(hairStyle)
            || Helper.isNullOrEmpty(hairSize) || Helper.isNullOrEmpty(hairColor) ||

    }
}
