
import java.util.ArrayList;


public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        } 
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
             suitcase.printItems();
        }
    }
    
    private int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        String toPrint = "";
        if (this.suitcases.isEmpty()) {
            toPrint = "no Suitcases";
        } else if (this.suitcases.size() == 1) {
            toPrint = "1 Suitcase";
        } else {
            toPrint = this.suitcases.size() + " suitcases";
        }
        
        return toPrint + " (" + this.totalWeight() + " kg)";
    }
}
