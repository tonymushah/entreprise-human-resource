package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class DiplomeTypeNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The diplomeType %s is not found", id);
        } else {
            return "The given id is null";
        }
    }

    public DiplomeTypeNotFoundException(UUID id) {
        super(DiplomeTypeNotFoundException.generateMessage(id));
    }

}
