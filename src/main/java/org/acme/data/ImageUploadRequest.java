package org.acme.data;

import io.smallrye.common.constraint.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageUploadRequest {

    @NotNull
    private String imageData;

    @NotNull
    private String originalFileName;

    // Example constructor
    public ImageUploadRequest(String imageData, String originalFileName) {
        this.imageData = imageData;
        this.originalFileName = originalFileName;
    }

}