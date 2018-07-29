package com.metropolitan.it355.demo.service;

import com.metropolitan.it355.demo.dto.DentalServiceDto;
import com.metropolitan.it355.demo.model.DentalService;

import java.util.List;

public interface DentalServiceService {
    void save(DentalService dentalService);
    DentalService findById(Long id);
    List<DentalService> findAll();
    void save(DentalServiceDto dentalServiceDto);
    boolean delete(String idString);
    DentalService update(DentalService appointment);
}
