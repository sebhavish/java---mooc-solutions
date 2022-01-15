
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String visiting = parts[1];
                if (team.equals(home)) {
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins++;
                    }
                    games++;
                } else if (team.equals(visiting)) {
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        wins++;
                    }
                    games++;
                }
            }
            
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (games - wins));
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
