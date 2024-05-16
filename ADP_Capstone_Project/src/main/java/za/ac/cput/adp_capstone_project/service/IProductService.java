package za.ac.cput.adp_capstone_project.service;

import za.ac.cput.adp_capstone_project.domain.Product;

import java.util.Set;

public interface IProductService extends IService<Product, String> {
    Set<Product> getall();
}
