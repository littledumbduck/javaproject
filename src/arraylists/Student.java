package arraylists;

public class Student {
    private String name;
    private int age;
    private double averageGrade;

    Student (String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    Student () {
        this.name = "";
        this.age = 0;
        this.averageGrade = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    @Override
    public String toString() {
        return  "Student: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Average grade: " + this.averageGrade;
    }
}
