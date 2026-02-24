package org.tnsif.accenture.c2tc.placement.controller;

import org.tnsif.accenture.c2tc.placement.entity.Placement;
import org.tnsif.accenture.c2tc.placement.service.PlacementService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    private final PlacementService service;

    public PlacementController(PlacementService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Placement> createPlacement(
            @RequestBody Placement placement) {
        return ResponseEntity.ok(service.createPlacement(placement));
    }

    @GetMapping
    public ResponseEntity<List<Placement>> getAllPlacements() {
        return ResponseEntity.ok(service.getAllPlacements());
    }

    @PatchMapping("/{id}/close")
    public ResponseEntity<Placement> closePlacement(
            @PathVariable UUID id) {
        return ResponseEntity.ok(service.closePlacement(id));
    }
}