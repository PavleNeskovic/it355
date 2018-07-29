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
    private String telephone;
    private String date;
    private String cause;
    private String emergency;
    private String delivery;

    public Appointment(AppointmentDto appointmentDto) {
        this.name = appointmentDto.getName();
        this.telephone = appointmentDto.getTelephone();
        this.date = appointmentDto.getDate();
        this.cause = appointmentDto.getCause();
        this.emergency = appointmentDto.getEmergency();
        this.delivery = appointmentDto.getDelivery();
    }

    public Appointment(String name, String telephone, String date, String cause, String emergency, String delivery) {
        this.name = name;
        this.telephone = telephone;
        this.date = date;
        this.cause = cause;
        this.emergency = emergency;
        this.delivery = delivery;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getEmergency() {
        return emergency;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
