package AquariumSystem.validation;


import AquariumSystem.exception.ValidationException;

public class WaterChangeValidator implements NoteValidation {

    public void validate(String note, int numberOfChar) throws ValidationException {
        //NoteValidator.validate(note, 60);
        numberOfChar = 60;

        if (note.length() > numberOfChar) {
            throw new ValidationException("Beskeden er for lang");
        }
    }
}