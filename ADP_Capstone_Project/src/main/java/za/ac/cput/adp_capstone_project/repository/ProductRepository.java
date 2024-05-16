package za.ac.cput.adp_capstone_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp_capstone_project.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
