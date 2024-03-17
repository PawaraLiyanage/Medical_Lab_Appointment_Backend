package com.medilab.model;

import lombok.*;
import org.hibernate.type.descriptor.java.BlobJavaType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class TestReport {
    private int id;
    private String patientName;
    private String patientNic;
    private String patientEmail;


    //Upload Test Result pdf
    //private BlobJavaType


}
