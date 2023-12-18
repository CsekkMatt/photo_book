package org.acme.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class UserAlreadyExistsExceptionMapper implements ExceptionMapper<UserAlreadyExistsException> {

    @Override
    public Response toResponse(UserAlreadyExistsException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(exception.getMessage())
                .build();
    }

}
