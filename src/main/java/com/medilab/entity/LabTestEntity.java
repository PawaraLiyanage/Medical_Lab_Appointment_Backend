package com.medilab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="LabTest")
@Data
public class LabTestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String testName;
    private String testCost;


}
