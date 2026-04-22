package AquariumSystem.validation;

import AquariumSystem.exception.ValidationException;

public class FishValidator implements NoteValidation {

    public void validate(String note, int numberOfChar) throws ValidationException {
        numberOfChar = 30;

        if (note.length() > numberOfChar) {
            throw new ValidationException("Beskeden er for lang");
        }

    }

    public void validateHealthNote(String note, int numberOfChar) {
        validate(note,numberOfChar);

    }
}
