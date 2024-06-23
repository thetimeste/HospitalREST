package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Questions {
    private double temperature;

    @JsonProperty("poisonous_substances")
    private boolean poisonousSubstances;

    @JsonProperty("breathe_correctly")
    private boolean breatheCorrectly;

    @JsonProperty("assumed_drug")
    private boolean assumedDrug;

    @JsonProperty("diabetes")
    private boolean diabetes;

    @JsonProperty("cardiovascular_disturbs")
    private boolean cardiovascularDisturbs;

    @JsonProperty("userID")
    private String userID;

    // Constructors, getters, and setters

    public Questions() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isPoisonousSubstances() {
        return poisonousSubstances;
    }

    public void setPoisonousSubstances(boolean poisonousSubstances) {
        this.poisonousSubstances = poisonousSubstances;
    }

    public boolean isBreatheCorrectly() {
        return breatheCorrectly;
    }

    public void setBreatheCorrectly(boolean breatheCorrectly) {
        this.breatheCorrectly = breatheCorrectly;
    }

    public boolean isAssumedDrug() {
        return assumedDrug;
    }

    public void setAssumedDrug(boolean assumedDrug) {
        this.assumedDrug = assumedDrug;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isCardiovascularDisturbs() {
        return cardiovascularDisturbs;
    }

    public void setCardiovascularDisturbs(boolean cardiovascularDisturbs) {
        this.cardiovascularDisturbs = cardiovascularDisturbs;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "userID='" + userID + '\'' +
                ", temperature=" + temperature +
                ", poisonousSubstances=" + poisonousSubstances +
                ", breatheCorrectly=" + breatheCorrectly +
                ", assumedDrug=" + assumedDrug +
                ", diabetes=" + diabetes +
                ", cardiovascularDisturbs=" + cardiovascularDisturbs +
                '}';
    }
}
