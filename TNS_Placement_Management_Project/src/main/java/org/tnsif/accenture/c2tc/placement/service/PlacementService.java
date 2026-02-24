package org.tnsif.accenture.c2tc.placement.service;

import org.tnsif.accenture.c2tc.placement.entity.Placement;
import org.tnsif.accenture.c2tc.placement.enums.PlacementStatus;
import org.tnsif.accenture.c2tc.placement.repository.PlacementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlacementService {

    private final PlacementRepository repository;

    public PlacementService(PlacementRepository repository) {
        this.repository = repository;
    }

    public Placement createPlacement(Placement placement) {
        placement.setStatus(PlacementStatus.OPEN);
        return repository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return repository.findAll();
    }

    public Placement closePlacement(UUID id) {
        Placement placement = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        placement.setStatus(PlacementStatus.CLOSED);
        return repository.save(placement);
    }
}