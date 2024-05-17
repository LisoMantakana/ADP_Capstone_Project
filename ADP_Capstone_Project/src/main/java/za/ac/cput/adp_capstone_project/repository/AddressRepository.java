package za.ac.cput.adp_capstone_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp_capstone_project.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
     Address findAddressById(Long addressId);

}
