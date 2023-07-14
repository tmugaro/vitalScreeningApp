package com.digitalhealthorg.vitalscreening.service;

import com.digitalhealthorg.vitalscreening.entities.Patient;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VitalSignsTestTest {

    @Test
    public void testBloodPressure() {
        VitalSigns vitalSigns = new VitalSigns();
        vitalSigns.setBloodPressure(120, 80);
        assertEquals(120, vitalSigns.getSystolicBloodPressure());
        assertEquals(80, vitalSigns.getDiastolicBloodPressure());
    }

    @Test
    public void testSetHeight() {
        Patient patient = new Patient();
        patient.setHeight((int) 1.75);

        assertEquals(1.75, patient.getHeight(), 0.001);
    }

}