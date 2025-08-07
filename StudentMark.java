import java.util.Scanner;
public class Student {
    int[] marks = new int[5];
    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    public double avg() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / 5.0;
    }
    public String grade() {
        double avg = avg();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.inputMarks();
        double average = s.avg();
        String grade = s.grade();

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
