
import java.util.Scanner;


public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                processInput(input);
            }
        }
    }
    
    private void processInput(String input) {
        if (input.equals("add")) {
            this.addTask();
        } else if (input.equals("list")) {
            this.listTasks();
        } else if (input.equals("remove")) {
            this.removeTask();
        }
    }
    
    private void addTask() {
        System.out.println("To add: ");
        String input = scanner.nextLine();
        this.todoList.add(input);
    }
    
    private void listTasks() {
        this.todoList.print();
    }
    
    private void removeTask() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(number);
    }
}
