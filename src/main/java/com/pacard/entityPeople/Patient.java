package com.pacard.entityPeople;

import com.pacard.entityRecord.Record;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="PATIENT")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;// Имя пациента
    enum Gender {male, female};

    private Gender gender; // Пол пациента
    private Calendar birthDate;
    private String phoneNumber;
    private String motherName;
    private String fatherName;
    private String patientAddress;

    // Информация о страховке
    private String policyNumber;
    private String insuranceCompanyName;
    private String cardNumber;

    // Записи
    @OneToMany(mappedBy="patient",fetch=FetchType.EAGER)
    private Collection<Record> records = new ArrayList<Record>();

    public Patient() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (patientId != patient.patientId) return false;
        if (birthDate != null ? !birthDate.equals(patient.birthDate) : patient.birthDate != null) return false;
        if (cardNumber != null ? !cardNumber.equals(patient.cardNumber) : patient.cardNumber != null) return false;
        if (gender != patient.gender) return false;
        if (patientName != null ? !patientName.equals(patient.patientName) : patient.patientName != null) return false;
        if (policyNumber != null ? !policyNumber.equals(patient.policyNumber) : patient.policyNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
