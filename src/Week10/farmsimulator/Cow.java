package Week9.farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private double capacity;
    private double amount;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        Random random = new Random();
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.capacity = 15 + random.nextInt(26);
        this.amount = 0.0;
    }

    public Cow(String name){
        this.name = name;
        Random random = new Random();
        this.capacity = 15 + random.nextInt(26);
        this.amount = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return this.name + " " +  this.capacity + " " + this.amount;
    }

    @Override
    public double milk() {
        double milkTaken = this.amount;
        this.amount = 0.0;
        return milkTaken;
    }

    @Override
    public void liveHour() {
        Random random = new Random();
        double milkProduced = 0.7 + (random.nextDouble() * 1.3);
        this.amount = Math.min(this.amount + milkProduced, this.capacity);
    }
}
