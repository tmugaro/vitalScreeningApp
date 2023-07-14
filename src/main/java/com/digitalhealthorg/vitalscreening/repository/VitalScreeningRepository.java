package com.digitalhealthorg.vitalscreening.repository;

import com.digitalhealthorg.vitalscreening.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitalScreeningRepository extends JpaRepository<Patient, Long> {

    Patient getPatientById(Integer id);
}
