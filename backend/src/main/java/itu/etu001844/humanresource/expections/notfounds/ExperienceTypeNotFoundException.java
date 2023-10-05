package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class ExperienceTypeNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The Experience Type %s is not found", id);
        } else {
            return "The given id is null";
        }
    }
    public ExperienceTypeNotFoundException(UUID id) {
        super(generateMessage(id));
    }
}
