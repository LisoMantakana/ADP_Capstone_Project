package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.Address;
import za.ac.cput.adp_capstone_project.domain.Customer;
import za.ac.cput.adp_capstone_project.util.Helper;

public class CustomerFactory {
    public static Customer buildCust(Long customerId, String firstName, String lastName, Long phoneNumber, Address address){
        if(Helper.isNumNullOrEmpty(customerId) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)
                || Helper.isNumNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(String.valueOf(address)))
            return null;
        return new Customer.Builder().setCustomer_id(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setAddress(address)
                .build();

    }
}
