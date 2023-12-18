package org.acme.exception;

public class NoteCreationException extends RuntimeException {
    public NoteCreationException(String message) {
        super(message);
    }
}
