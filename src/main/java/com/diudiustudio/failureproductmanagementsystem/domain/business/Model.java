package com.diudiustudio.failureproductmanagementsystem.domain.business;

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
public class Model implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany
    private Collection<Config> configs;

    private String nameCn;
    private String nameEn;


    public Model() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
//                ", configs=" + configs +
                ", nameCn='" + nameCn + '\'' +
                ", nameEn='" + nameEn + '\'' +
                '}';
    }

//    public Collection<Config> getCarConfigs() {
//        return configs;
//    }
//
//    public void setCarConfigs(Collection<Config> configs) {
//        this.configs = configs;
//    }
}
