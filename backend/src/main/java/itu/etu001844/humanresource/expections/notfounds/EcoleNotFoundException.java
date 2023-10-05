package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class EcoleNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The Ecole with ID %s is not found", id);
        } else {
            return "The given id is null";
        }
    }

    public EcoleNotFoundException(UUID id) {
        super(generateMessage(id));
    }
    
}
