package Week8;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country+ " "+regCode;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if comparing to itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast to RegistrationPlate and compare the fields
        RegistrationPlate other = (RegistrationPlate) obj;

        // Two registration plates are equal if both country and regCode are equal
        if (this.country.equals(other.country) && this.regCode.equals(other.regCode)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        // Combine the hashCodes of country and regCode
        return this.country.hashCode() + this.regCode.hashCode();
    }
}

