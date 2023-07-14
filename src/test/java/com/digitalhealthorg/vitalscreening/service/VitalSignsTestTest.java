package com.digitalhealthorg.vitalscreening.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VitalSignsTestTest {

    @Test
    public void testBloodPressure() {
        VitalSigns vitalSigns = new VitalSigns();
        vitalSigns.setBloodPressure(120, 80);
        assertEquals(120, vitalSigns.getSystolicBloodPressure());
        assertEquals(80, vitalSigns.getDiastolicBloodPressure());
    }

}