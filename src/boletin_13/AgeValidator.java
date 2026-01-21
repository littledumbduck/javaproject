package boletin_13;

public class AgeValidator {
    public static void ageValidator(int age) throws InvalidAgeException {
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Age is not valid");
        }
    }
}
