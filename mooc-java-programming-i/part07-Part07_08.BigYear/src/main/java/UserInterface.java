
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birdsList;
    
    public UserInterface(Scanner scanner, ArrayList<Bird> birdsList) {
        this.scanner = scanner;
        this.birdsList = birdsList;
    }
    
    public void start() {
        while (true) {
            System.out.println("? ");
            String command = this.scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                this.addBird();
            } else if (command.equals("Observation")) {
                this.addObservation();
            } else if (command.equals("All")) {
                this.printAll();
            } else if (command.equals("One")) {
                this.printOne();
            }
        }
    }
    
    public void addBird() {
        System.out.println("Name: ");
        String name = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        
        this.birdsList.add(new Bird(name, latinName));
    }
    
    public void addObservation() {
        System.out.println("Bird? ");
        String birdName = this.scanner.nextLine();
        Bird bird = this.returnBird(birdName);
        
        if (bird == null) {
            System.out.println("Not a bird!");
        } else {
            bird.addObservation();
        }
    }
    
    public void printAll() {
        for (Bird bird: this.birdsList) {
            System.out.println(bird);
        }
    }
    
    public void printOne() {
        System.out.println("Bird? ");
        String birdName = this.scanner.nextLine();
        Bird bird = this.returnBird(birdName);
        
        if (bird == null) {
            System.out.println("Not a bird!");
        } else {
            System.out.println(bird);
        }
    }
    
    private Bird returnBird(String name) {
        for (Bird bird: this.birdsList) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        
        return null;
    }
}
