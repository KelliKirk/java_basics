package Week1;

public class Ex5 {
    public static void main(String[] args) {
        int daysInYear = 365;
        int hoursInDay = 24;
        int secondsInHour = 3600;

        int secondsInDay = secondsInHour * hoursInDay;
        int secondsInYear = secondsInDay * daysInYear;

        System.out.println("There are " + secondsInYear +  "seconds in a year");
    }
}
