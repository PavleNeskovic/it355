package com.metropolitan.it355.demo.service.impl;

import com.metropolitan.it355.demo.dto.DentalServiceDto;
import com.metropolitan.it355.demo.model.DentalService;
import com.metropolitan.it355.demo.repository.DentalServiceRepository;
import com.metropolitan.it355.demo.service.DentalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentalServiceServiceImpl implements DentalServiceService {

    @Autowired
    private DentalServiceRepository dentalServiceRepository;

    @Override
    public void save(DentalService dentalService){
        if (dentalService.getId()==null){
            dentalServiceRepository.save(dentalService);
        } else {
            update(dentalService);
        }
    }

    @Override
    public DentalService findById(Long id){
        return dentalServiceRepository.findById(id).get();
    }

    @Override
    public List<DentalService> findAll(){
        return dentalServiceRepository.findAll();
    }

    @Override
    public void save(DentalServiceDto dentalServiceDto) {
        dentalServiceRepository.save(new DentalService(dentalServiceDto));
    }

    @Override
    public DentalService update(DentalService newDentalService) {
        DentalService oldDentalService = dentalServiceRepository.findById(newDentalService.getId()).get();
        oldDentalService.setName(newDentalService.getName());
        oldDentalService.setDescription(newDentalService.getDescription());
        dentalServiceRepository.save(oldDentalService);
        return newDentalService;
    }

    public boolean delete(String idString){
        try {
            Long id = Long.parseLong(idString);
            DentalService dentalService= dentalServiceRepository.findById(id).get();
            dentalServiceRepository.delete(dentalService);
        } catch (Exception e){
            System.out.println(e.getStackTrace());
            return false;
        }
        return true;
    }
}
