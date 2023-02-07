package entities;

public class Student {
    public String name;
    public double firstQuarterNote;
    public double secondQuarterNote;
    public double thirdQuarterNote;
    private final double MINIMUM_PASSING_GRADE = 6;

    public String returnStudentStatus() {
        if (!this.checkIfStudentPassed()) {
            return String.format(
                    "FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS",
                    this.finalGrade(),
                    this.returnMissingPoints());
        }
        return String.format("FINAL GRADE = %.2f\nPASS", this.finalGrade());
    }

    public double finalGrade() {
        return ((firstQuarterNote * 3) + (secondQuarterNote * 3.5) + (thirdQuarterNote * 3.5)) / 10.0;
    }

    public String toString() {
        return String.format("Name: %s", this.name);
    }

    private boolean checkIfStudentPassed() {
        return this.finalGrade() >= this.MINIMUM_PASSING_GRADE;
    }

    private double returnMissingPoints() {
        if (this.checkIfStudentPassed()) {
            return 0;
        }
        return this.MINIMUM_PASSING_GRADE - this.finalGrade();
    }
}
