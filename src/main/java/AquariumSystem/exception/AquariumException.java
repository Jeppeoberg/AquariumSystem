package AquariumSystem.exception;

public class AquariumException extends RuntimeException {
    public AquariumException(String message) {
        super("IKKE NOGET VAND" + " " + message);
    }
}
