package org.acme.service;

import java.util.List;

import org.acme.data.ImageUploadRequest;
import org.acme.model.Image;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImageService {

    public Image uploadImage(ImageUploadRequest image) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Image getImageById(Long imageId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Image> getAllImages() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
