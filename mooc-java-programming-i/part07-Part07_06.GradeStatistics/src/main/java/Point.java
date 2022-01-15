
public class Point {
    private int score;
    private boolean passed;
    
    public Point(int score, boolean passed) {
        this.score = score;
        this.passed = passed;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public boolean isPassed() {
        return this.passed;
    }
    
    public int grade() {
        if (this.score >= 90) {
            return 5;
        } else if (this.score >= 80) {
            return 4;
        } else if (this.score >= 70) {
            return 3;
        } else if (this.score >= 60) {
            return 2;
        } else if (this.score >= 50) {
            return 1;
        } else {
            return 0;
        }
    }
}
