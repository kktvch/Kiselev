package P9;
public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double GPA;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public Student(String name, int iDNumber, double GPA) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return name + " (ID: " + iDNumber + ", GPA: " + GPA + ")";
    }
}
