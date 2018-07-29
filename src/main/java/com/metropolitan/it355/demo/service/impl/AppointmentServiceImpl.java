package com.metropolitan.it355.demo.service.impl;

import com.metropolitan.it355.demo.dto.AppointmentDto;
import com.metropolitan.it355.demo.model.Appointment;
import com.metropolitan.it355.demo.repository.AppointmentRepository;
import com.metropolitan.it355.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void save(Appointment appointment) {
        if (appointment.getId()==null){
            appointmentRepository.save(appointment);
        } else {
            update(appointment);
        }
    }

    @Override
    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).get();
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public void save(AppointmentDto appointmentDto) {
        appointmentRepository.save(new Appointment(appointmentDto));
    }

    @Override
    public Appointment update(Appointment newAppointment) {
        Appointment oldAppointment = appointmentRepository.findById(newAppointment.getId()).get();
        oldAppointment.setName(newAppointment.getName());
        oldAppointment.setDescription(newAppointment.getDescription());
        appointmentRepository.save(oldAppointment);
        return newAppointment;
    }

    public boolean delete(String idString){
        try {
            Long id = Long.parseLong(idString);
            Appointment appointment = appointmentRepository.findById(id).get();
            appointmentRepository.delete(appointment);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
            return false;
        }
        return true;
    }

}
