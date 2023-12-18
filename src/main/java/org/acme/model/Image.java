package org.acme.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Image {
    private String fileName;
    private String fileType;
    private LocalDateTime uploadDateTime;
}
