package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.HairLength;
import za.ac.cput.adp_capstone_project.util.Helper;

public class HairLengthFactory {
    public static HairLength buildHairlength(String hairlengthID,String hairLengthValue,String lengthDescription,String image) {
        if (Helper.isNullOrEmpty(hairlengthID) || Helper.isNullOrEmpty(hairLengthValue) ||
                Helper.isNullOrEmpty(lengthDescription) ) ;
        {


        }

        return new HairLength.Builder().setHairlengthID(hairlengthID).
                setHairLengthValue(hairLengthValue).
                setLengthDescription(lengthDescription).
                build();

    }





}
