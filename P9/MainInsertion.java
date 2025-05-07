package P9;

public class MainInsertion {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Anna", 104),
            new Student("Boris", 101),
            new Student("Daria", 109),
            new Student("Ivan", 102)
        };

        InsertionSort.insertionSort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
