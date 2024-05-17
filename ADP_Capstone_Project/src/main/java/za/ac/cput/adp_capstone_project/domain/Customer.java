package za.ac.cput.adp_capstone_project.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    private Long customerId;

    private String firstName;
    private String lastName;
    private Long phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;
  /*  @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")*/

    public Customer() {
    }

    public Customer(Builder builder){
        this.customerId = builder.customer_id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, phoneNumber, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                '}';
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


    public static class Builder{
        private Long customer_id;
        private String firstName;
        private String lastName;
        private Long phoneNumber;
        Address address;

        public Builder setCustomer_id(Long customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(Customer customer){
            this.customer_id = customer.customerId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.phoneNumber = customer.phoneNumber;
            this.address = customer.address;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}

