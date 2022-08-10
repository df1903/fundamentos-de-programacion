/** 3) Student with an array of grades: average and pass/fail. */

public class Student {

    // attributes
    private String name;
    private double[] grades;

    // constructor
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double average() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean passed() {
        return average() >= 3.0;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Laura", new double[] {4.5, 3.8, 4.0}),
            new Student("Pedro", new double[] {2.1, 3.0, 2.5}),
            new Student("Sofia", new double[] {5.0, 4.7, 4.9})
        };

        for (Student s : students) {
            System.out.printf("%s: %.2f - %s%n", s.getName(), s.average(),
                    s.passed() ? "passed" : "failed");
        }
    }
}
