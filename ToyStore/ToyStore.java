package ToyStore;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    List<Toy> toys = new ArrayList<Toy>();
    int count;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
        this.count = toys.size();
    }

    

    

}
