
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        
        String printOutput = "The collection " + this.name + " has " + elements.size();
        if (elements.size() == 1) {
            printOutput = printOutput + " element:";
        } else {
            printOutput = printOutput + " elements:";
        }
        
        String elementInCollection = "";
        for (String element: elements) {
            elementInCollection = elementInCollection + "\n" + element;
        }
        return printOutput + elementInCollection;
    }
}
