package com.medilab.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class LabTest {
    private  int id;
    private String testName;
    private String testCost;

}
