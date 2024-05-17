package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.repository;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Inventory;

import java.util.List;

public interface IInventoryRepository extends za.ac.cput.adp_capstone_project.repository.IRepository<Inventory, String> {
    List<Inventory> getAll();

}
