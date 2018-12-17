package com.majunwei.learn.webflow.gohome.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GoHomeDomain implements Serializable {
    private String startLocation = "Beijing";
    private String endLocation = "Jinan";
    private String currentLocation = startLocation;
    private List<String> somethings = new ArrayList<>();
    private int remainingOil = 50;      //当前油量
    private int mixRemainingOil = 5;    //最小油量（加油阀值）
    private int maxRemainingOil = 60;   //最大油量

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public List<String> getSomethings() {
        return somethings;
    }

    public void setSomethings(List<String> somethings) {
        this.somethings = somethings;
    }

    public int getRemainingOil() {
        return remainingOil;
    }

    public void setRemainingOil(int remainingOil) {
        this.remainingOil = remainingOil;
    }

    public int getMixRemainingOil() {
        return mixRemainingOil;
    }

    public void setMixRemainingOil(int mixRemainingOil) {
        this.mixRemainingOil = mixRemainingOil;
    }

    public int getMaxRemainingOil() {
        return maxRemainingOil;
    }

    public void setMaxRemainingOil(int maxRemainingOil) {
        this.maxRemainingOil = maxRemainingOil;
    }

    public int getSomethingsSize(){
        return this.somethings.size();
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
