package org.tnsif.accenture.c2tc.placement.repository;

import org.tnsif.accenture.c2tc.placement.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PlacementRepository
        extends JpaRepository<Placement, UUID> {
}