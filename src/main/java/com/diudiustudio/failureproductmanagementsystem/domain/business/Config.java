package com.diudiustudio.failureproductmanagementsystem.domain.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by liuhongjian on 15/10/28.
 */
@Entity
public class Config implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nameCn;
    private String nameEn;
    @ManyToOne
    private Model model;

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", nameCn='" + nameCn + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", model=" + model +
                '}';
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
