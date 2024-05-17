package ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.repository;

import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Inventory;
import ADP_Capstone_Project.src.main.java.za.ac.cput.adp_capstone_project.domain.Shipping;

import java.util.ArrayList;
import java.util.List;

public class ShippingRepository implements IShippingRepository{
    private static IShippingRepository repo = null;
    private ArrayList<Shipping> shipList;

    private ShippingRepository(){
        shipList = new ArrayList<Shipping>();
    }
    public static IShippingRepository getRepo(){
        if(repo == null){
            repo = new ShippingRepository();
        }
        return repo;
    }
    @Override
    public Shipping create(Shipping o) {
        boolean success = shipList.add(o);
        if(success)
            return o;
        return null;
    }

    @Override
    public Shipping read(String id) {
        for(Shipping s : shipList){
            if(s.getShippingID().equals(id))
                return s;
        }
        return null;
    }

    @Override
    public Shipping update(Shipping o) {
        String shipmentIdentification = o.getShippingID();
        if(delete(shipmentIdentification)){
            if(shipList.add(o))
                return o;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete (String id){
       Shipping shipmentToDelete = read(id);
        if(shipmentToDelete == null)
            return false;
        return (shipList.remove(shipmentToDelete));

    }
    @Override
    public List<Shipping> getAll(){
        return null;
    }


}


