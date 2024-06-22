package com.example.demo;

public class Questions {
    private double temperature;
    private boolean poisonousSubstances;
    private boolean breatheCorrectly;
    private boolean assumedDrug;
    private boolean diabetes;
    private boolean cardiovascularDisturbs;

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

    @Override
    public String toString() {
        return "Questions{" +
                "temperature=" + temperature +
                ", poisonousSubstances=" + poisonousSubstances +
                ", breatheCorrectly=" + breatheCorrectly +
                ", assumedDrug=" + assumedDrug +
                ", diabetes=" + diabetes +
                ", cardiovascularDisturbs=" + cardiovascularDisturbs +
                '}';
    }
}
