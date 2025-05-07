package P9;
public class MainQuick {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Anna", 104, 3.7),
            new Student("Boris", 101, 4.5),
            new Student("Daria", 109, 4.0),
            new Student("Ivan", 102, 3.9)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        for (Student s : students) {
            System.out.println(s.getName() + " GPA: " + s.getGPA());
        }
    }
}
