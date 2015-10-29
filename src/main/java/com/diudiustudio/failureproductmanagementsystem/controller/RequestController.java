package com.diudiustudio.failureproductmanagementsystem.controller;

import com.diudiustudio.failureproductmanagementsystem.Application;
import com.diudiustudio.failureproductmanagementsystem.domain.CarConfig;
import com.diudiustudio.failureproductmanagementsystem.domain.CarType;
import com.diudiustudio.failureproductmanagementsystem.repository.CarConfigReposity;
import com.diudiustudio.failureproductmanagementsystem.repository.CarTypeReposity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhongjian on 15/10/27.
 */
@RestController
@Component
public class RequestController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    @Autowired
    private CarTypeReposity carTypeReposity;
    @Autowired
    private CarConfigReposity carConfigReposity;

    @RequestMapping("/index")
    public CarType index() {
        CarType carType = new CarType();
        carType.setId(1L);
        carType.setTypeCn("Benz");
        return carType;
    }

    @RequestMapping(value = "/carType", method = RequestMethod.POST)
    void add(@RequestBody CarType carType) {
        carTypeReposity.save(carType);
    }


    @RequestMapping(value = "/carConfig", method = RequestMethod.POST)
    void add(@RequestBody CarConfig carConfig) {
        carConfigReposity.save(carConfig);
    }
//    @RequestMapping("/car")
//    public CommandLineRunner cars() {
//        return args -> {
//            CarType carType1 = new CarType();
//            carType1.setTypeCn("no1");
//            CarType carType2 = new CarType();
//            carType2.setTypeCn("no2");
//            CarType carType3 = new CarType();
//            carType3.setTypeCn("no3");
//            CarType carType4 = new CarType();
//            carType4.setTypeCn("no4");
//            CarType carType5 = new CarType();
//            carType5.setTypeCn("no5");
//            CarType carType6 = new CarType();
//            carType6.setTypeCn("no6");
//            repository.save(carType1);
//            repository.save(carType2);
//            repository.save(carType3);
//            repository.save(carType4);
//            repository.save(carType5);
//            repository.save(carType6);
//            repository.findAll().forEach((car) -> log.info(car.toString()));
//            repository.findOne(1L);
//        };
//    }


}
