package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.repository;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Inventory;
import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Shipping;

import java.util.List;

public interface IShippingRepository extends za.ac.cput.adp_capstone_project.repository.IRepository {
    List<Shipping> getAll();

}
