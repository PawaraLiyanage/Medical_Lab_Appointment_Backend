package com.medilab.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class LabTecnician {
    private int id;
    private String name;
    private String contactNumber;

}
