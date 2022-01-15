
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipeList;
    
    public UserInterface(Scanner scanner, ArrayList<Recipe> recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String fileName = this.scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String recipeName = fileScanner.nextLine();
                int time = Integer.valueOf(fileScanner.nextLine());
                Recipe recipe = new Recipe(recipeName, time);
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
                this.recipeList.add(recipe);
            }
            
            this.readCommands();
            
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }
    
    public void printRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipeList) {
            System.out.println(recipe);
        }
    }
    
    public void readCommands() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {  
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.printRecipes();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = this.scanner.nextLine();
                this.findName(name);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(this.scanner.nextLine());
                this.findRecipes(time);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String item = this.scanner.nextLine();
                this.findByIngredient(item);
            }
        }
    }
    
    public void findName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipeList) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findRecipes(int time) {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipeList) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String item) {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipeList) {
            if (recipe.getIngredients().contains(item)) {
                System.out.println(recipe);
            }
        }
    }
}
