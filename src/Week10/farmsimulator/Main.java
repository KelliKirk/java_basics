package Week9.farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 31.1 Bulk Tank
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);

        // 31.2 Cows
        Cow cow = new Cow();
        System.out.println(cow);


        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println("");

        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);

        // 31.3 Milking Robot
        MilkingRobot milkingRobot = new MilkingRobot();
        milkingRobot.setBulkTank(tank);
        System.out.println("Bulk tank: " + tank);

        for(int i = 0; i < 2; i++) {
            System.out.println(cow);
            System.out.println("Living..");
            for(int j = 0; j < 5; j++) {
                cow.liveHour();
            }
            System.out.println(cow);

            System.out.println("Milking...");
            milkingRobot.milk(cow);
            System.out.println("Bulk tank: " + tank);
        }

        // 31.4 Barn
        Barn barn = new Barn(new BulkTank());
        System.out.println("Barn: " + barn);

        System.out.println("Debug - Tank capacity: " + barn.getBulkTank().getCapacity());
        System.out.println("Debug - Tank volume: " + barn.getBulkTank().getVolume());
        System.out.println("Barn: " + barn);

        MilkingRobot robot = new MilkingRobot();
        barn.installMilkingRobot(robot);

        Cow ammu = new Cow();
        ammu.liveHour();
        ammu.liveHour();

        barn.takeCareOf(ammu);
        System.out.println("Barn: " + barn);

        LinkedList<Cow> cowList = new LinkedList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());

        for(Cow cow1: cowList) {
            cow1.liveHour();
            cow1.liveHour();
        }

        barn.takeCareOf(cowList);
        System.out.println("Barn: " + barn);

        //31.5 Farm
        Farm farm = new Farm("Maiu", new Barn(new BulkTank()));
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());

        farm.liveHour();
        farm.liveHour();

        MilkingRobot robot1 = new MilkingRobot();
        farm.installMilkingRobot(robot1);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        farm.liveHour();
        farm.liveHour();

        farm.manageCows();
        System.out.println(farm);

    }
}
