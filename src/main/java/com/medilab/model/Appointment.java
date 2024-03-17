package com.medilab.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Appointment {
    private int id;
    private String patientName;
    private String doctorName;
    private String testName;
    private String appointmentDate;
    private String appointmentTime;

}
