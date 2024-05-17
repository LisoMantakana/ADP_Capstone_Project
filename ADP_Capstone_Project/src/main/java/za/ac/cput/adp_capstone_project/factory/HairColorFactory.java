package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.HairColor;
import za.ac.cput.adp_capstone_project.util.Helper;

public class HairColorFactory {
public static HairColor buildHairColor(String colorCode,String colorName,String description){
    if (Helper.isNullOrEmpty(colorCode)||Helper.isNullOrEmpty(description)){

    }

    return new HairColor.HairColorBuilder().
            setColorCode(colorCode).
            setColorName(colorName).
            setDescription(description).
            build();
}

}
