package Week9.application;

public class Main {
        public static void main(String[] args) {
            /*ConstantSensor ten = new ConstantSensor(10);
            ConstantSensor minusFive = new ConstantSensor(-5);

            System.out.println( ten.measure() );
            System.out.println( minusFive.measure() );

            System.out.println( ten.isOn() );
            ten.off();
            System.out.println( ten.isOn() );

            // 20.2 - Testing thermometer

            Thermometer thermometer = new Thermometer();

            // Initial state should be off
            System.out.println("Initial state - Is on: " + thermometer.isOn());

            // Test measure when off
           try {
                int temp = thermometer.measure();
                System.out.println("Temperature:" + temp);
            } catch (IllegalStateException e) {
                System.out.println("Exception: " + e.getMessage());
            }

            // Turn thermometer on
            thermometer.on();
            System.out.println("Thermometer is turned on: " + thermometer.isOn());

            // Test measure when on. Should return a random number between -30 and 30
            System.out.println("Taking 5 measurements");
            for(int i = 0; i < 5; i++){
                int temp = thermometer.measure();
                System.out.println("Temperature:" + (i+1) + temp);
            }

            // Turn thermometer off
            thermometer.off();
            System.out.println("Thermometer is turned off: " + thermometer.isOn());
            try {
                int temp = thermometer.measure();
                System.out.println("Temperature:" + temp);
            } catch (IllegalStateException e) {
                System.out.println("Exception: " + e.getMessage());
            }*/

            // 20.3 AverageSensor
            Sensor kumpula = new Thermometer();
            kumpula.on();
            System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

            Sensor kaisaniemi = new Thermometer();
            Sensor helsinkiVantaa = new Thermometer();

            AverageSensor helsinkiArea = new AverageSensor();
            helsinkiArea.addSensor(kumpula);
            helsinkiArea.addSensor(kaisaniemi);
            helsinkiArea.addSensor(helsinkiVantaa);

            helsinkiArea.on();
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
            System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

            System.out.println("readings: "+helsinkiArea.readings());
        }
        }




