package com.digitalhealthorg.vitalscreening.service;

import com.digitalhealthorg.vitalscreening.entities.Patient;
import com.digitalhealthorg.vitalscreening.repository.VitalScreeningRepository;

import java.util.List;

public class VitalSignsService {

    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private double height;
    private double weight;
    private int bloodGlucose;


    private VitalScreeningRepository vitalScreeningRepositoryRepository;

    public Patient savePatient(Patient patient) {
        return vitalScreeningRepositoryRepository.save(patient);
    }


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

    public void setWeight(double weight) {
        // Validate the input value
        if (height < 0) {
            throw new IllegalArgumentException("weight cannot be negative");
        }

        // Set the height value
        this.weight = weight;
    }

    public void setBloodGlucoseLevel(int bloodGlucoseLevel) {
        // Validate the input value
        if (bloodGlucoseLevel < 0) {
            throw new IllegalArgumentException("Blood glucose level cannot be negative");
        }

        // Set the blood glucose level value
        this.bloodGlucose = bloodGlucoseLevel;
    }


    public List<Patient> getAllPatients() {
    }


    public Patient getPatientById(Integer id) {
    }

    public void deletePatient(Integer sno) {
    }




}


