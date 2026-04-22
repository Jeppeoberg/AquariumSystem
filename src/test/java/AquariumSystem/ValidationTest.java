package AquariumSystem;

import AquariumSystem.validation.FishValidator;
import AquariumSystem.validation.WaterChangeValidator;
import AquariumSystem.exception.ValidationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {

    WaterChangeValidator waterValidator = new WaterChangeValidator();
    FishValidator fishValidator = new FishValidator();

    // A normal valid note should work without any errors
    // "assertDoesNotThrow" checks that NO exception is thrown
    @Test
    void validWaterNote_doesNotThrow(){
        assertDoesNotThrow(() -> waterValidator.validate("30% water changed", 60));
    }


    // A note that is too long should NOT be allowed
    // "x".repeat(61) creates a String of 61 x's - one over the limit of 60
    @Test
    void waterNoteTooLong_throwsException(){
        String longNote = "x".repeat(61);
        assertThrows(ValidationException.class, () -> waterValidator.validate(longNote, 60));
    }

    // A note is exactly 60 characters should be allowed
    // This is an edge case test - we test right at the edge of the limit
    // "x".repeat(60) creates a String of exactly 60 x's
    @Test
    void waterNoteExactlyMaxLength_doesNotThrow(){
        String exactNote = "x".repeat(60);
        assertDoesNotThrow(() -> waterValidator.validate(exactNote, 60));
    }


    // A valid fish health note should work without errors
    @Test
    void validFishNote_doesNotThrow(){
        assertDoesNotThrow(() -> fishValidator.validate("Looks healthy", 30));
    }


    // A fish health note that is too long should NOT be allowed
    @Test
    void fishNoteTooLong_throwsException(){
        String longNote = "x".repeat(31);
        assertThrows(ValidationException.class, () -> fishValidator.validate(longNote, 30));
    }


}