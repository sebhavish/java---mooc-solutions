
import java.util.ArrayList;


public class ExerciseManagement {

    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();   
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise: this.exercises) {
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise element: this.exercises) {
            if (element.getName().equals(exercise)) {
                element.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise element: this.exercises) {
            if (element.getName().equals(exercise)) {
                return element.isCompleted();
            }
        }
        return false;
    }
}
