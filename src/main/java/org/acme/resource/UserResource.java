package org.acme.resource;

import org.acme.auth.UserService;
import org.acme.data.UserRegistrationRequest;
import org.acme.exception.UserAlreadyExistsException;

import io.vertx.ext.auth.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    @Inject
    UserService userService;

    @POST
    @Path("/register")
    public Response registerUser(UserRegistrationRequest request) {
        try {
            userService.registerUser(request);
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception e) {
            throw new UserAlreadyExistsException("User already exists....");
        }
    }

}