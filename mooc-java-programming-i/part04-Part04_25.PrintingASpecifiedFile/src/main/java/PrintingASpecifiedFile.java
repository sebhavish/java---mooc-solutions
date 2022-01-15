
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        try (Scanner fileInput = new Scanner(Paths.get(fileName))) {
            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }
}
