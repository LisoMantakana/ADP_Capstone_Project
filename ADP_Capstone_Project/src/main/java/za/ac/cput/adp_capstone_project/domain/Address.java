package za.ac.cput.adp_capstone_project.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Address {

    @Id
    private Long addressId;
    private int streetNumber;
    private String streetName;
    private String city;
    private int zipCode;

    public Address() {
    }

    public Address(Builder builder){
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
    }

    public Long getAddressId() {
        return addressId;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return streetNumber == address.streetNumber && Objects.equals(addressId, address.addressId) && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, streetNumber, streetName, city, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }


    public static class Builder{
        private Long addressId;
        private int streetNumber;
        private String streetName;
        private String city;
        private int zipCode;


        public Builder setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(int zipCode) {
            this.zipCode = zipCode;
            return this;
        }


        public Builder copy(Address address){
            this.addressId = address.addressId;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.city = address.city;
            this.zipCode = address.zipCode;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}

