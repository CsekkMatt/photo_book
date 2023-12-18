package org.acme.resource;

import org.acme.data.ImageUploadRequest;
import org.acme.model.Image;
import org.acme.service.ImageService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/images")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImageResource {

    @Inject
    ImageService imageService;

    @POST
    @Transactional
    @Path("/upload")
    public Response uploadImage(ImageUploadRequest imageUploadRequest) {
        imageService.uploadImage(imageUploadRequest);
        return Response.status(Response.Status.CREATED)
                .entity(imageUploadRequest).build();
    }

    @GET
    @Path("/{id}")
    public Response getImageById() {
        Image image = imageService.getImageById(1L);
        return Response.ok(image).build();
    }

    @GET
    public Response getAllImages() {
        return Response.ok(imageService.getAllImages()).build();
    }
}
