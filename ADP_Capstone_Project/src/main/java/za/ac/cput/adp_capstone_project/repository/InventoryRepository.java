package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.repository;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Inventory;

import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.delete;

public class InventoryRepository implements IInventoryRepository{

    private static IInventoryRepository repo = null;
    private ArrayList<Inventory>invList;

    private InventoryRepository(){
        invList = new ArrayList<Inventory>();
    }
    public static IInventoryRepository getRepo(){
        if(repo == null){
            repo = new InventoryRepository();
        }
        return repo;
    }
    @Override
    public Inventory create (Inventory inv){
        boolean success = invList.add(inv);
        if (success)
            return inv;
        return null;

    }
    @Override
    public Inventory read (String id){
        for (Inventory i : invList){
            if (i.getProductID().equals(id)){
                return i;
            }
        }
        return null;
    }

    @Override
    public Inventory update(Inventory inv){
        String supplierID = inv.getSupplierID();
        if(delete(supplierID)){
            if (invList.add(inv))
                return inv;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete (String d){
        Inventory invToDelete = read(d);
        if(invToDelete == null)
            return false;
        return (invList.remove(invToDelete));

    }
    @Override
    public List<Inventory> getAll(){
        return null;
    }
}
