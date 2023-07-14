package com.digitalhealthorg.vitalscreening.web;

import com.digitalhealthorg.vitalscreening.entities.Patient;
import com.digitalhealthorg.vitalscreening.service.VitalSignsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patientDetails")
public class VitalScreeningController {

        private VitalSignsService vitals;

        @PostMapping("/savePatient")
        public ResponseEntity<String> savePatient(@RequestBody Patient patient) {
            Integer id = vitals.savePatient(patient);
            return new ResponseEntity<String>("Patient with '" + id + "' has been saved", HttpStatus.OK);

        }

}
