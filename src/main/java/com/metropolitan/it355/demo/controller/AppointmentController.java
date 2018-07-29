package com.metropolitan.it355.demo.controller;

import com.metropolitan.it355.demo.model.Appointment;
import com.metropolitan.it355.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView get() {
        return addModelToForm(new Appointment());
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute Appointment appointment, ModelMap model) {
        appointmentService.save(appointment);
        model.addAttribute("appointments", appointmentService.findAll());
        return "appointment/view";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayAll(ModelMap model) {
        model.addAttribute("appointments", appointmentService.findAll());
        return "appointment/view";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public ModelAndView getUpdate(@PathVariable String id, @ModelAttribute Appointment appointment, ModelMap model) {
        Appointment appointmentById = appointmentService.findById(Long.valueOf(id));
        return addModelToForm(appointmentById);
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") String id, ModelMap model) {
        appointmentService.delete(id);
        model.addAttribute("msg", "User with id: " + id + "is deleted successfully");
        return "redirect:/appointment";
    }

    private ModelAndView addModelToForm(Appointment appointmentById) {
        return new ModelAndView("appointment/add", "command", appointmentById);
    }

//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String postUpdate(@ModelAttribute Appointment appointment, ModelMap model) {
//        Appointment appointmentById = appointmentService.update(appointment);
//        model.addAttribute("appointment", appointmentById);
//        return "appointment/view";
//    }
}
