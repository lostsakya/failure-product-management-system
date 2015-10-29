package com.diudiustudio.failureproductmanagementsystem.repository;

import com.diudiustudio.failureproductmanagementsystem.Application;
import com.diudiustudio.failureproductmanagementsystem.domain.CarConfig;
import com.diudiustudio.failureproductmanagementsystem.domain.CarType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuhongjian on 15/10/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CarTypeReposityTest {

    @Autowired
    private CarTypeReposity carTypeReposity;
    @Autowired
    private CarConfigReposity carConfigReposity;

    private CarType carType;
    private CarConfig carConfig;


    @Before
    public void setUp() throws Exception {


        CarType carType11 = new CarType();
        CarType carType12 = new CarType();
        CarType carType13 = new CarType();
        CarType carType14 = new CarType();
        CarType carType15 = new CarType();
        CarType carType51 = new CarType();
        CarType carType52 = new CarType();
        CarType carType53 = new CarType();
        carType11.setTypeCn("type1");
        carType12.setTypeCn("type1");
        carType13.setTypeCn("type1");
        carType14.setTypeCn("type1");
        carType15.setTypeCn("type1");
        carType51.setTypeEn("type5");
        carType52.setTypeEn("type5");
        carType53.setTypeEn("type5");
        carTypeReposity.save(carType11);
        carTypeReposity.save(carType12);
        carTypeReposity.save(carType13);
        carTypeReposity.save(carType14);
        carTypeReposity.save(carType15);
        carTypeReposity.save(carType51);
        carTypeReposity.save(carType52);
        carTypeReposity.save(carType53);

        carType = new CarType();
        carType.setTypeCn("type");
        carConfig = new CarConfig();
//        carConfig.setCarType(carType);

        carTypeReposity.save(carType);
        carConfigReposity.save(carConfig);
    }

    @Test
    public void testFindByType() throws Exception {
        System.out.println();
        Iterable all = carTypeReposity.findAll();
        System.out.println();
        all.forEach(carType -> System.out.println(carType));
    }
}
