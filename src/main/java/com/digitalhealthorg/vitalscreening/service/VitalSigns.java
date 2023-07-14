package com.digitalhealthorg.vitalscreening.service;

public class VitalSigns {

    private int systolicBloodPressure;
    private int diastolicBloodPressure;

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


    }

    public int getDiastolicBloodPressure() {
    }
}
