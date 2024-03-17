package com.medilab.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Doctor {

    private int id;
    private String name;
    private String specialization;
    private String contactNumber;
}
