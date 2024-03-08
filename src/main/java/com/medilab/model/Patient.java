package com.medilab.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Patient {

    private String name;
    private String age;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;


}
