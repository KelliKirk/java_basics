package Week10.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> organisms;

    public Group() {
        this.organisms = new ArrayList<>();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable organism : this.organisms) {
            result.append(organism.toString()).append("\n");
        }
            return result.toString();
    }

    public void addToGroup(Movable organism) {
        this.organisms.add(organism);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable organism : this.organisms){
            organism.move(dx, dy);
        }
    }
}
