
import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("add")) {
                this.addToDictionary();
            } else if (input.equals("search")) {
                this.search();
            } else if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Unknown command");
            }
        } 
    }
    
    public void addToDictionary() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();
        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
            return;
        }
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}
