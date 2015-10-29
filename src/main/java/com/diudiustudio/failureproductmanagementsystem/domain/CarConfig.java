package com.diudiustudio.failureproductmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by liuhongjian on 15/10/28.
 */
@Entity
public class CarConfig implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    private String configCn;
    private String configEn;
    @ManyToOne
    private CarType carType;

    @Override
    public String toString() {
        return "CarConfig{" +
                "id=" + id +
                ", configCn='" + configCn + '\'' +
                ", configEn='" + configEn + '\'' +
                ", carType=" + carType +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConfigCn() {
        return configCn;
    }

    public void setConfigCn(String configCn) {
        this.configCn = configCn;
    }

    public String getConfigEn() {
        return configEn;
    }

    public void setConfigEn(String configEn) {
        this.configEn = configEn;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
