import java.util.ArrayList;
import java.util.List;

public class StudentGradeManager {

    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {
        // Reverse each individual name (like "John" becomes "nhoJ")
        // Keep the array order the same
        // Return the modified array
        String[] reversedName = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedName[i] = new StringBuilder(names[i]).reverse().toString();
        }
        return reversedName;

    }

    // Method to calculate letter grades
    public static char getLetterGrade(int score) {
        // Use if-else conditions:
        // 90-100: 'A', 80-89: 'B', 70-79: 'C', 60-69: 'D', below 60: 'F'
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }

    }

    // Method to find students who need to retake exam
    public static String[] findFailingStudents(String[] names, int[] scores) {
        // Return array of names where score is below 60
        // Use loops to check each student
        List<String> failingList = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failingList.add(names[i]);
            }
        }

        String[] result = new String[failingList.size()];
        return failingList.toArray(result);

    }

    public static void main(String[] args) {
        String[] students = { "Alice", "Bob", "Charlie", "Diana" };
        int[] scores = { 95, 67, 45, 78 };
        // Test all your methods
        // Display results clearly
        System.out.println("Reverse Student Names");
        String [] reverseStudentNames = reverseStudentNames(students);
        for (String name : reverseStudentNames) {
            System.out.println("- " + name);
        }

        int index = 0 ; 
        System.out.println("Letter Grade");
        for (int x : scores) {
            char gradeChar = getLetterGrade(x);
            System.out.println("name : " + students[index] + ",Letter Grade : " + gradeChar );
            index++;
        }

        String [] faildSudent =findFailingStudents(students, scores);
        for ( String F: faildSudent) {
            System.out.println("- "+ F );
            
        }
        


    }
}
