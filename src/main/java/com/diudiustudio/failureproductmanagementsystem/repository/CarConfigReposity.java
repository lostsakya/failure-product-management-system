package com.diudiustudio.failureproductmanagementsystem.repository;

import com.diudiustudio.failureproductmanagementsystem.domain.CarConfig;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liuhongjian on 15/10/27.
 */
//@Repository
public interface CarConfigReposity extends CrudRepository<CarConfig, Long>
 {
//    CarType findByConfigCn(String typeEn);
//    CarType findByConfigEn(String typeEn);
}
