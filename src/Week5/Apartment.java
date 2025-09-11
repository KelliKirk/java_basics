package Week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.rooms > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    // Exercise 87.2: Price difference
    public int apartmentPrice(Apartment apartment) {
        return this.rooms * this.pricePerSquareMeter;
    }
    public int priceDifference(Apartment otherApartment) {
       return Math.abs(apartmentPrice(this) - apartmentPrice(otherApartment));
    }
    //Exercise 87.3: More expensive than
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.apartmentPrice(this) < this.apartmentPrice(otherApartment)) {
            return false;
        }
        return true;
    }
}
