package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class SpecialiteNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The specialite %s is not found", id);
        } else {
            return "The given id is null";
        }
    }
    
    public SpecialiteNotFoundException(UUID id) {
        super(generateMessage(id));
    }
    
}
