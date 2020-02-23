package com.mycode.everything.recyclerview;

import java.lang.ref.SoftReference;

public class Heroes {
    private String heroName;
    private String heroDetail;
    private  int heroImage;

    public String getheroName() {
        return heroName;
    }

    public void setheroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(String heroDetail) {
        this.heroDetail = heroDetail;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }


}


