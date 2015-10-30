package com.diudiustudio.failureproductmanagementsystem.repository.business;

import com.diudiustudio.failureproductmanagementsystem.domain.business.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by liuhongjian on 15/10/27.
 */
@RepositoryRestResource(collectionResourceRel = "station", path = "station")
public interface ConfigRepository extends JpaRepository<Config, Long> {
//    Model findByConfigCn(String typeEn);
//    Model findByConfigEn(String typeEn);
}
