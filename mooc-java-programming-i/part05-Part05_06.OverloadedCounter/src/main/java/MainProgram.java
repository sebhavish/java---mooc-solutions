
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        counter.increase();
        counter.increase(50);
        counter.decrease(30);
        counter.increase(-20);
        System.out.println(counter.value());
    }
}
