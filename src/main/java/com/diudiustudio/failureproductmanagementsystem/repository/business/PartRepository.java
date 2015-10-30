package com.diudiustudio.failureproductmanagementsystem.repository.business;

import com.diudiustudio.failureproductmanagementsystem.domain.business.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by sakya on 2015/10/28.
 */
@RepositoryRestResource(collectionResourceRel = "part", path = "part")
public interface PartRepository extends JpaRepository<Part, Long> {
}
