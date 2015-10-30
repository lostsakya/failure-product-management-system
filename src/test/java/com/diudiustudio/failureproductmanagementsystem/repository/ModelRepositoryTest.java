package com.diudiustudio.failureproductmanagementsystem.repository;

import com.diudiustudio.failureproductmanagementsystem.Application;
import com.diudiustudio.failureproductmanagementsystem.domain.business.Config;
import com.diudiustudio.failureproductmanagementsystem.domain.business.Model;
import com.diudiustudio.failureproductmanagementsystem.repository.business.ConfigRepository;
import com.diudiustudio.failureproductmanagementsystem.repository.business.ModelRepository;
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
public class ModelRepositoryTest {

    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private ConfigRepository configRepository;

    private Model model;
    private Config config;


    @Before
    public void setUp() throws Exception {


        Model model11 = new Model();
        Model model12 = new Model();
        Model model13 = new Model();
        Model model14 = new Model();
        Model model15 = new Model();
        Model model51 = new Model();
        Model model52 = new Model();
        Model model53 = new Model();
        model11.setNameCn("type1");
        model12.setNameCn("type1");
        model13.setNameCn("type1");
        model14.setNameCn("type1");
        model15.setNameCn("type1");
        model51.setNameEn("type5");
        model52.setNameEn("type5");
        model53.setNameEn("type5");
        modelRepository.save(model11);
        modelRepository.save(model12);
        modelRepository.save(model13);
        modelRepository.save(model14);
        modelRepository.save(model15);
        modelRepository.save(model51);
        modelRepository.save(model52);
        modelRepository.save(model53);

        model = new Model();
        model.setNameCn("type");
        config = new Config();
//        config.setModel(model);

        modelRepository.save(model);
        configRepository.save(config);
    }

    @Test
    public void testFindByType() throws Exception {
        System.out.println();
        Iterable all = modelRepository.findAll();
        System.out.println();
        all.forEach(carType -> System.out.println(carType));
    }
}
