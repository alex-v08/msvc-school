package com.microservice.student.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;;


    private String phone;
    private String address;
    @Column(name = "course_id")
    private Long courseId;



}
