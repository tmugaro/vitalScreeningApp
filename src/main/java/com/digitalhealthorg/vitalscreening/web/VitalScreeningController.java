package com.digitalhealthorg.vitalscreening.web;

import com.digitalhealthorg.vitalscreening.entities.Patient;
import com.digitalhealthorg.vitalscreening.repository.VitalScreeningRepository;
import com.digitalhealthorg.vitalscreening.service.VitalSignsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patientDetails")
public class VitalScreeningController {

        private VitalSignsService vitals;

        private VitalScreeningRepository vitalScreeningRepository;

        @PostMapping("/savePatientVitals")
        public ResponseEntity<String> savePatient(@RequestBody Patient patient) {
            Patient id = vitals.savePatient(patient);
            return new ResponseEntity<String>("Patient with '" + id + "' has been saved", HttpStatus.OK);
        }

    @GetMapping("/patientList")
    public ResponseEntity<List<Patient>> getAllPatientDetails(){
        List<Patient> list = vitals.getAllPatients();
        return new ResponseEntity<List<Patient>>(list,HttpStatus.OK);
    }

    @PutMapping("/updatePatient/{id}")
    public ResponseEntity<String> updatePatient( @PathVariable("id") Integer id,  @RequestBody Patient patient) {
        Patient screening = vitalScreeningRepository.getPatientById(id);

        screening.setFirstName(screening.getFirstName());
        screening.setLastName(screening.getLastName());
        screening.setDateOfBirth(screening.getDateOfBirth());
        screening.setBloodGlucose(screening.getBloodGlucose());
        screening.setHeight(screening.getHeight());
        screening.setWeight(screening.getWeight());
        screening.setDiastolicBloodPressure(screening.getDiastolicBloodPressure());
        screening.setSystolicBloodPressure(screening.getSystolicBloodPressure());


        screening = vitals.savePatient(screening);

        return new ResponseEntity<String>("Patient with '" + id + "' has been updated", HttpStatus.OK);
    }


}
