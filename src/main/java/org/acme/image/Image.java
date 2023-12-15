package org.acme.image;

import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Image extends PanacheEntity {
    private String fileName;
    private String fileType;
    private LocalDateTime uploadDateTime;

    public Image() {

    }

    public Image(String fileName, String fileType, LocalDateTime uploadDateTime) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.uploadDateTime = uploadDateTime;
    }

}
