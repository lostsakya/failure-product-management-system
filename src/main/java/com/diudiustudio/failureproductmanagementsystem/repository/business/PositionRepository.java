package com.diudiustudio.failureproductmanagementsystem.repository.business;

import com.diudiustudio.failureproductmanagementsystem.domain.business.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sakya on 2015/10/28.
 */
@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PositionRepository extends JpaRepository<Position, Long> {
}
