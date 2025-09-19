package Week9.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> measurementHistory;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.measurementHistory = new ArrayList<>();
    }

    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        if(sensors.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(!(this.isOn() || sensors.isEmpty())){
            throw new IllegalStateException("Sensor is empty");
        }

        // Calculating average of all sensor readings
        int sum = 0;
        for(Sensor sensor : sensors){
            sum += sensor.measure();
        } return sum / sensors.size();
    }

    public List<Integer> readings() {
        return new ArrayList<>(measurementHistory);
    }
}
