package za.ac.cput.adp_capstone_project.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.adp_capstone_project.domain.HairColor;

import static org.junit.jupiter.api.Assertions.*;

class HairColorFactoryTest {
private   HairColor C1;
private HairColor c2;
    private HairColor C3;

    @BeforeEach
    void setUp() {
        C1 = new HairColor.HairColorBuilder()
                .setColorCode("pnk1")
                .setColorName("Pink")
                .setDescription("This color has different shades of pink")
                .build();
        c2=new HairColor.HairColorBuilder()
                .setColorCode("pnk1")
                .setColorName("Pink")
                .setDescription("")
                .build();
        C3 = new HairColor.HairColorBuilder()
                .setColorCode("pnk1")
                .setColorName("Pink")
                .setDescription("This color has different shades of pink")
                .build();
    }

    @Test
    void buildHairColor() {
        assertNotNull(C1);
        System.out.println(C1.toString());
    }

    @Test
    void identityTest(){
        assertNotSame(C1, C3);
    }

}