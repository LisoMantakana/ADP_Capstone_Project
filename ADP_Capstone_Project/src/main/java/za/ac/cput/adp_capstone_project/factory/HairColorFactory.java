package za.ac.cput.adp_capstone_project.factory;

import za.ac.cput.adp_capstone_project.domain.HairColor;
import za.ac.cput.adp_capstone_project.util.Helper;

public class HairColorFactory {
public static HairColor buildHairColor(String colorCode,String colorName,String description,String image){
    if (Helper.isNullOrEmpty(colorCode)||Helper.isNullOrEmpty(description)||Helper.isNullOrEmpty(image)){
        
    }

    return new HairColor.hairColorBuilder().
            setColorCode(colorCode).
            setColorName(colorName).
            setDescription(description).
            setImage(image).
            build();
}

}
