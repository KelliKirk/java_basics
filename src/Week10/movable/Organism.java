package Week10.movable;

public class Organism implements Movable {
    private int x, y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Organism(" + x + "," + y + ")";
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
