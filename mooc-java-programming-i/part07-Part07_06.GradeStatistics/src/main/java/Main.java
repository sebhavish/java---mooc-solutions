
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Points points = new Points();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            points.add(input);
        }
        
        System.out.println("Point average (all): " + points.average());
        double averageOfPassed = points.averageOfPassed();
        if (averageOfPassed == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averageOfPassed);
        }
        
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution:");
        int starsToPrint = 0;
        for (int i = 5; i >= 0; i--) {
            starsToPrint = points.numberOfGrades(i);
            System.out.print(i + ": ");
            Main.printStars(starsToPrint);
        }
    }
    
    public static void printStars(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    } 
}
