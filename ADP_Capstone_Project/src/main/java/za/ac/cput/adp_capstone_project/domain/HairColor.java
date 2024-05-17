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

    protected HairColor() {
    }

    public HairColor(HairColorBuilder builder) {
        this.colorCode = builder.colorCode;
        this.colorName = builder.colorName;
        this.description = builder.description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HairColor hairColor = (HairColor) o;
        return Objects.equals(colorCode, hairColor.colorCode) && Objects.equals(colorName, hairColor.colorName) && Objects.equals(description, hairColor.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorCode, colorName, description);
    }

    @Override
    public String toString() {
        return "HairColor{" +
                "colorCode='" + colorCode + '\'' +
                ", colorName='" + colorName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class HairColorBuilder {
        private String colorCode;
        private String colorName;
        private String description;

        public HairColorBuilder setColorCode(String colorCode) {
            this.colorCode = colorCode;
            return this;
        }

        public HairColorBuilder setColorName(String colorName) {
            this.colorName = colorName;
            return this;
        }

        public HairColorBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public HairColorBuilder copy(HairColor hairColor) {
            this.colorCode = hairColor.colorCode;
            this.colorName = hairColor.colorName;
            this.description = hairColor.description;
            return this;
        }

        public HairColor build() {
            return new HairColor(this);
        }
    }
}

