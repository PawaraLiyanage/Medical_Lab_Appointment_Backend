package com.medilab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="TestReports")
@Data
public class TestReportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String testResult;




    //Report ID, Patient ID, Test ID, Test Result, Date
}
