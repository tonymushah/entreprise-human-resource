package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class EntrepriseNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The entreprise %s is not found", id);
        } else {
            return "The given id is null";
        }
    }
    public EntrepriseNotFoundException(UUID id) {
        super(generateMessage(id));
    }
    
}
