package com.microservice.course.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Builder
@Setter
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Professor;


}
