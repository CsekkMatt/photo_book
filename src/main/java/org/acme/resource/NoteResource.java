package org.acme.resource;

import java.util.List;

import org.acme.auth.NoteService;
import org.acme.exception.NoteCreationException;
import org.acme.exception.NoteNotFoundException;
import org.acme.model.Note;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/notes")
public class NoteResource {

    @Inject
    private NoteService noteService;

    @GET
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GET
    @Path("/{id}")
    public Note getNoteById(@PathParam("id") Long id) {
        Note note = noteService.findNoteById(id);
        if (note == null) {
            throw new NoteNotFoundException("Note with id " + id + " not found");
        }
        return note;
    }

    @POST
    public Response createNote(Note note) {
        try {
            noteService.saveNote(note);
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
            throw new NoteCreationException("Error creating note");
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateNote(@PathParam("id") Long id, Note note) {
        note.setId(id);
        noteService.updateNote(note);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteNote(@PathParam("id") Long id) {
        try {
            noteService.deleteNote(id);
            return Response.status(Response.Status.OK).build();
        } catch (Exception e) {
            throw new NoteNotFoundException("Note with id " + id + " not found");
        }

    }

}
