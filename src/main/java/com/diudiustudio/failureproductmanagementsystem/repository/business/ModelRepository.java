package com.diudiustudio.failureproductmanagementsystem.repository.business;

import com.diudiustudio.failureproductmanagementsystem.domain.business.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by liuhongjian on 15/10/27.
 */
@RepositoryRestResource(collectionResourceRel = "model", path = "model")
public interface ModelRepository extends JpaRepository<Model, Long> {
    Model findByNameCn(String typeCn);
    Model findByNameEn(String typeEn);
}
