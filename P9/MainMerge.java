package P9;
public class MainMerge {
    public static void main(String[] args) {
        Student[] group1 = {
            new Student("Anna", 101),
            new Student("Boris", 103)
        };
        Student[] group2 = {
            new Student("Daria", 102),
            new Student("Ivan", 104)
        };

        Student[] merged = MergeSort.merge(group1, group2);
        for (Student s : merged) {
            System.out.println(s);
        }
    }
}
