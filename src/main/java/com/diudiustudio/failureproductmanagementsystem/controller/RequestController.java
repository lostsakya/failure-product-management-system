package com.diudiustudio.failureproductmanagementsystem.controller;

import com.diudiustudio.failureproductmanagementsystem.Application;
import com.diudiustudio.failureproductmanagementsystem.domain.business.Model;
import com.diudiustudio.failureproductmanagementsystem.repository.business.ConfigRepository;
import com.diudiustudio.failureproductmanagementsystem.repository.business.ModelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhongjian on 15/10/27.
 */
@RestController
public class RequestController {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private ConfigRepository configRepository;

    @RequestMapping("/index")
    public Model index() {
        Model model = new Model();
        model.setId(1L);
        model.setNameCn("Benz");
        return model;
    }

//    @RequestMapping(value = "/carType", method = RequestMethod.POST)
//    void add(@RequestBody Model model) {
//        modelRepository.save(model);
//    }
//
//
//    @RequestMapping(value = "/carConfig", method = RequestMethod.POST)
//    void add(@RequestBody Config config) {
//        configRepository.save(config);
//    }
//    @RequestMapping("/car")
//    public CommandLineRunner cars() {
//        return args -> {
//            Model carType1 = new Model();
//            carType1.setNameCn("no1");
//            Model carType2 = new Model();
//            carType2.setNameCn("no2");
//            Model carType3 = new Model();
//            carType3.setNameCn("no3");
//            Model carType4 = new Model();
//            carType4.setNameCn("no4");
//            Model carType5 = new Model();
//            carType5.setNameCn("no5");
//            Model carType6 = new Model();
//            carType6.setNameCn("no6");
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
