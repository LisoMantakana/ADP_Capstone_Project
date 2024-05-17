package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.Address;
import za.ac.cput.adp_capstone_project.util.Helper;

public class AddressFactory {
    public static Address buildAdd(Long addressId,int streetNumber ,String streetName,String city,int zipCode){
    if(Helper.isNumNullOrEmpty(addressId) || Helper.isIntNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName)
         || Helper.isNullOrEmpty(city) || Helper.isIntNullOrEmpty(zipCode))
        return null;
    return new Address.Builder()
            .setAddressId(addressId)
            .setStreetNumber(streetNumber)
            .setStreetName(streetName)
            .setCity(city)
            .setZipCode(zipCode)
            .build();
    }
}
