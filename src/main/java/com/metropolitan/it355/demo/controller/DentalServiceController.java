package com.metropolitan.it355.demo.controller;

import com.metropolitan.it355.demo.model.DentalService;
import com.metropolitan.it355.demo.service.DentalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/dentalService")
public class DentalServiceController {

    @Autowired
    private DentalServiceService dentalServiceService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView get() {
        return addModelToForm(new DentalService());
    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayAll(ModelMap model) {
        model.addAttribute("dentalServices", dentalServiceService.findAll());
        return "dentalService/view";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute DentalService dentalService, ModelMap model) {
        dentalServiceService.save(dentalService);
        model.addAttribute("dentalServices", dentalServiceService.findAll());
        return "dentalService/view";
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public ModelAndView getUpdate(@PathVariable String id, @ModelAttribute DentalService dentalService, ModelMap model) {
        DentalService appointmentById = dentalServiceService.findById(Long.valueOf(id));
        return addModelToForm(appointmentById);
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") String id, ModelMap model) {
        dentalServiceService.delete(id);
        model.addAttribute("msg", "User with id: " + id + "is deleted successfully");
        return "redirect:/appointment";
    }

    private ModelAndView addModelToForm(DentalService dentalService) {
        return new ModelAndView("dentalService/add", "command", dentalService);
    }

}
