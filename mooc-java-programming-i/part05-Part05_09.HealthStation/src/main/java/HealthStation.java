
public class HealthStation {

    private int weights;

    public HealthStation() {
        this.weights = 0;
    }
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weights++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weights;
    }
}
