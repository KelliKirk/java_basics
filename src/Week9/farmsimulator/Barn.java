package Week9.farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.bulkTank = tank;
        this.milkingRobot = null;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.bulkTank);
    }

    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The milking robot hasn't been installed.");
        }
        this.milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The milking robot hasn't been installed.");
        }

        for(Cow cow : cows){
            this.milkingRobot.milk(cow);
        }
    }

    @Override
    public String toString() {
        return this.bulkTank.toString();
    }
}
