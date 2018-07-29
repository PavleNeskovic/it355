package com.metropolitan.it355.demo.service;

import com.metropolitan.it355.demo.dto.AppointmentDto;
import com.metropolitan.it355.demo.model.Appointment;

import java.util.List;

public interface AppointmentService {
    void save(Appointment appointment);
    Appointment findById(Long id);
    List<Appointment> findAll();
    void save(AppointmentDto appointmentDto);
    Appointment update(Appointment appointment);
    boolean delete(String idString);

}
