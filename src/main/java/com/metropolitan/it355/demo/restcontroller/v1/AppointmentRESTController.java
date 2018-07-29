package com.metropolitan.it355.demo.restcontroller.v1;

import com.metropolitan.it355.demo.dto.AppointmentDto;
import com.metropolitan.it355.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

@RestController
@RequestMapping("/v1/appointments")
public class AppointmentRESTController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> get() {
        return new ResponseEntity<>(appointmentService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> get(@PathVariable("id") String id) {
        return new ResponseEntity<>(appointmentService.findById(Long.parseLong(id)), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes ="application/json",produces = "application/json")
    public ResponseEntity<?> post(@RequestBody AppointmentDto appointmentDto) {
        appointmentService.save(appointmentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
