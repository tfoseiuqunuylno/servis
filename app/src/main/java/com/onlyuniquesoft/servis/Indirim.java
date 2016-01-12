package com.onlyuniquesoft.servis;

/**
 * Created by Mustafa on 12.1.2016.
 */
public class Indirim {
    private String isim;
    private double fiyat;

    public  Indirim(String uisim,double ufiyat)
    {
        isim=uisim;
        fiyat=ufiyat;
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

