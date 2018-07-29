package com.metropolitan.it355.demo.restcontroller.v1;

import com.metropolitan.it355.demo.dto.DentalServiceDto;
import com.metropolitan.it355.demo.model.DentalService;
import com.metropolitan.it355.demo.service.DentalServiceService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/dentalServices")
public class DentalServiceRESTController {

    @Autowired
    private DentalServiceService dentalServiceService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> get() {
        return new ResponseEntity<>(dentalServiceService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> get(@PathVariable("id") String id) {
        return new ResponseEntity<>(dentalServiceService.findById(Long.parseLong(id)), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes ="application/json",produces = "application/json")
    public ResponseEntity<?> post(@RequestBody DentalServiceDto dentalServiceDto) {
        dentalServiceService.save(dentalServiceDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
