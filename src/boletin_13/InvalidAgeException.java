package boletin_13;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public String toString () {
        return getMessage();
    }
}
