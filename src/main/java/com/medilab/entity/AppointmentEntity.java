package com.medilab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Appointment")
@Data
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String patientName;
    private String testName;
    private String appointmentDate;
    private String appointmentTime;

}
