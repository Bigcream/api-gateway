package com.example.galleryservice.entity;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Gallery {
    private Integer id;
    private List<Object> images;
}
