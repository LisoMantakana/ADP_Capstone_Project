package za.ac.cput.adp_capstone_project.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class HairColor {
    @Id
    private String colorCode;
    private String colorName;
    private String description;
    private String image;

    public HairColor() {
    }

    public HairColor(hairColorBuilder builder) {
        this.colorCode = builder.colorCode;
        this.colorName =builder.colorName;
        this.description = builder.description;
        this.image = builder.image;
    }

    public String getColorCode() {
        return colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HairColor hairColor = (HairColor) o;
        return Objects.equals(colorCode, hairColor.colorCode) && Objects.equals(colorName, hairColor.colorName) && Objects.equals(description, hairColor.description) && Objects.equals(image, hairColor.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorCode, colorName, description, image);
    }

    @Override
    public String toString() {
        return "HairColor{" +
                "colorCode='" + colorCode + '\'' +
                ", colorName='" + colorName + '\'' +
                ", description=" + description +
                ", image='" + image + '\'' +
                '}';
    }
    public static class hairColorBuilder{
        private String colorCode;
        private String colorName;
        private String description;
        private String image;

        public hairColorBuilder setColorCode(String colorCode) {
            this.colorCode = colorCode;
            return this;
        }

        public hairColorBuilder setColorName(String colorName) {
            this.colorName = colorName;
            return this;
        }

        public hairColorBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public hairColorBuilder setImage(String image) {
            this.image = image;
            return this;
        }
        public hairColorBuilder copy(HairColor hairColor){
            this.colorCode = hairColor.colorCode;
            this.colorName = hairColor.colorName;
            this.description = hairColor.description;
            this.image = hairColor.image;

            return this;
        }
        public HairColor build(){
            return new HairColor(this);
        }

    }
}
