package com.diudiustudio.failureproductmanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by liuhongjian on 15/10/27.
 */

@Entity
public class CarType implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    @OneToMany
    private Collection<CarConfig> carConfigs;

    private String typeCn;
    private String typeEn;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeCn() {
        return typeCn;
    }

    public void setTypeCn(String typeCn) {
        this.typeCn = typeCn;
    }

    public CarType() {
    }


    public String getTypeEn() {
        return typeEn;
    }

    public void setTypeEn(String typeEn) {
        this.typeEn = typeEn;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "id=" + id +
//                ", carConfigs=" + carConfigs +
                ", typeCn='" + typeCn + '\'' +
                ", typeEn='" + typeEn + '\'' +
                '}';
    }

//    public Collection<CarConfig> getCarConfigs() {
//        return carConfigs;
//    }
//
//    public void setCarConfigs(Collection<CarConfig> carConfigs) {
//        this.carConfigs = carConfigs;
//    }
}
