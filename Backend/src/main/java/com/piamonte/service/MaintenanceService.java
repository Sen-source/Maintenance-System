package com.piamonte.service;

import com.piamonte.entity.MaintenanceRequest;
import com.piamonte.repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceService {
    @Autowired
    private MaintenanceRepository maintenanceRepository;

    public List<MaintenanceRequest> getAllRequests() {
        return maintenanceRepository.findAll();
    }

    public Optional<MaintenanceRequest> getRequestById(Long id) {
        return maintenanceRepository.findById(id);
    }

    public MaintenanceRequest createRequest(MaintenanceRequest request) {
        return maintenanceRepository.save(request);
    }

    public MaintenanceRequest updateRequest(Long id, MaintenanceRequest request) {
        request.setId(id);
        return maintenanceRepository.save(request);
    }

    public void deleteRequest(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
