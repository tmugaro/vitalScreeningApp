package com.digitalhealthorg.vitalscreening.service;

public class VitalSigns {

    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private double height;

    public void setBloodPressure(int systolic, int diastolic) {
        // Validate the input values
        if (systolic < 0 || diastolic < 0) {
            throw new IllegalArgumentException("Blood pressure values cannot be negative");
        }

        // Set the blood pressure values
        this.systolicBloodPressure = systolic;
        this.diastolicBloodPressure = diastolic;
    }

    public int getSystolicBloodPressure() {

    return 0;
    }

    public int getDiastolicBloodPressure() {
        return 0;
    }

    public void setHeight(double height) {
        // Validate the input value
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }

        // Set the height value
        this.height = height;
    }
}


