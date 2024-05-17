package za.ac.cput.adp_capstone_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adp_capstone_project.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerById(Long customerId);
}
