package itu.etu001844.humanresource.expections.notfounds;

import java.util.UUID;

public class CandidatNotFoundException extends RuntimeException {
    protected static String generateMessage(UUID id) {
        if (id != null) {
            return String.format("The candidat %s is not found", id);
        } else {
            return "The given id is null";
        }
    }
    public CandidatNotFoundException(UUID id) {
        super(generateMessage(id));
    }
}
