package com.example.StudentManagementSystem.dto;

import java.io.Serializable;
import java.util.Objects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDto implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
