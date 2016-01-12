package com.onlyuniquesoft.servis;

/**
 * Created by Mustafa on 12.1.2016.
 */
public class Indirim {
    private String isim;
    private double fiyat;

    public  Indirim(String iIsim,double iFiyat)
    {
        isim=iIsim;
        fiyat=iFiyat;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}

