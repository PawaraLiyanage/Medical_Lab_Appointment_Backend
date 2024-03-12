package com.medilab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Patient")
@Data

//Create Patient Entity
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String name;
    private String age;
    private String nic;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;

}
