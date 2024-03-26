package Homework3.test;

import Homework3.main.StudentGradingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradingSystemTest {

    @Test
    public void testCalculateAverageGrade() {
        StudentGradingSystem gradingSystem = new StudentGradingSystem();
        int[] grades = {80, 90, 75, 85};
        assertEquals(82.5, gradingSystem.calculateAverageGrade(grades));
    }

    @Test
    public void testHasPassed() {
        StudentGradingSystem gradingSystem = new StudentGradingSystem();
        assertTrue(gradingSystem.hasPassed(75, 60));
        assertFalse(gradingSystem.hasPassed(50, 60));
    }

    @Test
    public void testCalculateHighestGrade() {
        StudentGradingSystem gradingSystem = new StudentGradingSystem();
        int[] grades = {80, 90, 75, 85};
        assertEquals(90, gradingSystem.calculateHighestGrade(grades));
    }

    @Test
    public void testAnalyzePerformance() {
        StudentGradingSystem gradingSystem = new StudentGradingSystem();
        assertEquals("Good", gradingSystem.analyzePerformance(75));
        assertEquals("Average", gradingSystem.analyzePerformance(60));
        assertEquals("Poor", gradingSystem.analyzePerformance(40));
    }
}

