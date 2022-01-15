
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Person ram = new Person("Ram");
        Person raj = new Person("Raj");

        ram.setHeight(180);
        ram.setWeight(86);
        
        raj.setHeight(175);
        raj.setWeight(64);
        
        System.out.println(raj.getName() + ", body mass index is " + raj.bodyMassIndex());
        System.out.println(ram.getName() + ", body mass index is " + ram.bodyMassIndex());
    }
}
