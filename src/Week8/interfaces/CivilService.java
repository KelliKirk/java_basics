package Week8.interfaces;


public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}