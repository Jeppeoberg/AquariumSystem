package AquariumSystem.exception;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super("Det er ikke muligt at udføre den ønskede handling" + " " + message);
    }
}
