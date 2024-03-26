package Homework3.main;

public class StudentGradingSystem {

    public double calculateAverageGrade(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Grades array cannot be empty");
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean hasPassed(double averageGrade, double passingGradeThreshold) {
        return averageGrade >= passingGradeThreshold;
    }

    public int calculateHighestGrade(int[] grades) {
        if (grades.length == 0) {
            throw new IllegalArgumentException("Grades array cannot be empty");
        }
        int highestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public String analyzePerformance(double averageGrade) {
        if (averageGrade >= 90) {
            return "Excellent";
        } else if (averageGrade >= 70) {
            return "Good";
        } else if (averageGrade >= 50) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
