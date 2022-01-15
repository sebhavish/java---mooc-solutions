
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item: this.items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() {
        String toPrint = "";
        if (this.items.isEmpty()) {
            toPrint = "no items";
        } else if (this.items.size() == 1) {
            toPrint = "1 item";
        } else {
            toPrint = this.items.size() + " items";
        }
        return toPrint + " (" + this.totalWeight() + " kg)";
    }
}
