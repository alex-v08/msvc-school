package com.microservice.course.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String name;

    private String lastName;

    private String email;;


    private String phone;
    private String address;

    private Long courseId;

}
