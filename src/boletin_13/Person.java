package boletin_13;

public class Person {
    private int age;

    public Person() {
        this.age = 0;
    }

    public void setAge(int age) {
        try {
            if(age < 0){
                throw new Exception("Number must be positive.");
            }
            this.age = age;
            System.out.println("Age updated.");
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
