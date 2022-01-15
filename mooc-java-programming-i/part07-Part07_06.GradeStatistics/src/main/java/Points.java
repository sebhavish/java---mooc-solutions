
import java.util.ArrayList;

class Points {
    private ArrayList<Point> points;
    
    public Points() {
        this.points = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point >= 0 && point < 50) {
            this.points.add(new Point(point, false));
        } else if (point >= 50 && point <= 100) {
            this.points.add(new Point(point, true));
        }
    }
    
    public double average() {
        if (this.points.isEmpty()) {
            return 0.0;
        }
        
        int sum = 0;
        for (Point point: this.points) {
            sum += point.getScore();
        }
        return 1.0 * sum / this.points.size();
    }
    
    public double averageOfPassed() {
        int countOfPassed = 0;
        int sum = 0;
        for (Point point: this.points) {
            if (point.isPassed()) {
                sum += point.getScore();
                countOfPassed++;
            }
        }
        if (countOfPassed == 0) {
            return 0.0;
        }
        return 1.0 * sum / countOfPassed;
    }
    
    public double passPercentage() {
        int countOfPassed = 0;
        for (Point point: this.points) {
            if (point.isPassed()) {
                countOfPassed++;
            }
        }
        
        return 100.0 * countOfPassed / this.points.size();
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (Point point: this.points) {
            if (point.grade() == grade) {
                count++;
            }
        }
        return count;
    }
}
