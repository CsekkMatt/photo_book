package org.acme.resource;

import org.acme.service.RandomNamesService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/random-names")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RandomNamesResource {

    @Inject
    RandomNamesService randomNamesService;

    @GET
    public Response getRandomNames() {
        return Response.ok(randomNamesService.getRandomNames()).build();
    }

    // TODO implement a POST method that receives a list of names and returns a list
    // of names with the prefix "Hello "

}
