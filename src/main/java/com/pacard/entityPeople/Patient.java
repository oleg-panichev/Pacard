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
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;// Имя пациента
    private String patientSurname;
    private String patientSecondName;

    @Column(name="Gender", columnDefinition="enum('Male','Female')")
    private String gender; // Пол пациента
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
    @OneToMany(mappedBy="patient",fetch=FetchType.LAZY)
    private Collection<Record> records = new ArrayList<Record>();

    public Patient() {
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getPatientSecondName() {
        return patientSecondName;
    }

    public void setPatientSecondName(String patientSecondName) {
        this.patientSecondName = patientSecondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Collection<Record> getRecords() {
        return records;
    }

    public void setRecords(Collection<Record> records) {
        this.records = records;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (!birthDate.equals(patient.birthDate)) return false;
        if (!fatherName.equals(patient.fatherName)) return false;
        if (!gender.equals(patient.gender)) return false;
        if (!motherName.equals(patient.motherName)) return false;
        if (!patientName.equals(patient.patientName)) return false;
        if (!patientSurname.equals(patient.patientSurname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patientName.hashCode();
        result = 31 * result + patientSurname.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + motherName.hashCode();
        result = 31 * result + fatherName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientSurname='" + patientSurname + '\'' +
                ", patientSecondName='" + patientSecondName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", patientAddress='" + patientAddress + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", insuranceCompanyName='" + insuranceCompanyName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", records=" + records +
                '}';
    }
}
