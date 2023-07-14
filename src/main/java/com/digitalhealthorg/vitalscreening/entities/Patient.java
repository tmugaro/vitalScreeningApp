package com.digitalhealthorg.vitalscreening.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;


@Data
@Entity
public class Patient {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

        private int patientId;

        private String firstName;

        private String lastName;

        private String gender;

        private LocalDate dateOfBirth;

        private String bloodGroup;

        private String phoneNumber;

        private String emailAddress;

        private int height;

         private int weight;

         private int bp;

         private int bloodGlucose;

}
