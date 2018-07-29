package com.metropolitan.it355.demo.model;

import com.metropolitan.it355.demo.dto.AppointmentDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    public Appointment(AppointmentDto appointmentDto) {
        this.name = appointmentDto.getName();
        this.description = appointmentDto.getDescription();
    }

    public Appointment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
