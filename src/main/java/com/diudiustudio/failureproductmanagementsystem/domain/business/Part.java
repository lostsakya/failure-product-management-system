package com.diudiustudio.failureproductmanagementsystem.domain.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sakya on 2015/10/28.
 */
@Entity
public class Part {
    @Id
    @GeneratedValue
    private long id;
    private long drawingNo;
    private String nameCn;
    private String nameEn;
    private float priceEuro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDrawingNo() {
        return drawingNo;
    }

    public void setDrawingNo(long drawingNo) {
        this.drawingNo = drawingNo;
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

    public float getPriceEuro() {
        return priceEuro;
    }

    public void setPriceEuro(float priceEuro) {
        this.priceEuro = priceEuro;
    }
}
