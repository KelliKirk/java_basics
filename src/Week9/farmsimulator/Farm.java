package Week9.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public Barn getBarn() {
        return this.barn;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Farm owner: ").append(this.owner).append("\n");
        result.append("Barn bulk tank: ").append(this.barn.toString()).append("\n");
        if (this.cows.isEmpty()) {
            result.append("No cows.");
        } else {
            result.append("Animals:");
            for (Cow cow : this.cows) {
                result.append("\n        ").append(cow.toString());
            }
        }

        return result.toString();
    }
}