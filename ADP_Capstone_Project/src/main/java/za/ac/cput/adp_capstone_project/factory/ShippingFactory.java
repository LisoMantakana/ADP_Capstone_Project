package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.factory;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Shipping;

import java.util.Date;

public class ShippingFactory {

    public static Shipping buildShipping(String shippingID, String orderID, String shippingCourier, int trackingNumber, double shippingCost, Date shippingDate, Date estimatedDeliveryDate, String deliveryStatus) {
        if (za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(shippingID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(orderID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(shippingCourier) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(trackingNumber)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(shippingCost)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(shippingDate)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(estimatedDeliveryDate)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(deliveryStatus))
            return null;
        return new Shipping.Builder()
                .setShippingID(shippingID)
                .setOrderID(orderID)
                .setShippingCourier(shippingCourier)
                .setTrackingNumber(trackingNumber)
                .setEstimatedDeliveryDate(estimatedDeliveryDate)
                .setDeliveryStatus(deliveryStatus)
                .build();
    }

    public static Shipping buildShipping(String orderID, String shippingCourier, int trackingNumber, double shippingCost, Date shippingDate, Date estimatedDeliveryDate, String deliveryStatus) {
        if (za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(orderID) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(shippingCourier) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(trackingNumber)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(shippingCost)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(shippingDate)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(String.valueOf(estimatedDeliveryDate)) || za.ac.cput.adp_capstone_project.util.Helper.isNullOrEmpty(deliveryStatus))
            return null;
        String shippingID = za.ac.cput.adp_capstone_project.util.Helper.generateId();
        return new Shipping.Builder()
                .setShippingID(shippingID)
                .setOrderID(orderID)
                .setShippingCourier(shippingCourier)
                .setTrackingNumber(trackingNumber)
                .setEstimatedDeliveryDate(estimatedDeliveryDate)
                .setDeliveryStatus(deliveryStatus)
                .build();
    }
}