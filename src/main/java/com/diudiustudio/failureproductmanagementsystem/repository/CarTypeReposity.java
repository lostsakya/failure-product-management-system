package com.diudiustudio.failureproductmanagementsystem.repository;

import com.diudiustudio.failureproductmanagementsystem.domain.CarType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by liuhongjian on 15/10/27.
 */
//@Repository
public interface CarTypeReposity extends CrudRepository<CarType, Long> {
//    CarType findByTypeCn(String typeCn);
//    CarType findByTypeEn(String typeEn);
}
