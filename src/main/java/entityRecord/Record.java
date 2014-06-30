package com.pacard.entityRecord;

import com.pacard.entityPeople.Doctor;
import com.pacard.entityPeople.Patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.*;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="RECORD")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @ManyToOne
    @JoinColumn(name="patientId")
    private Patient patient;

    // Информация об обследовании
    private Calendar date;

    @ManyToOne
    @JoinColumn(name="doctorId")
    private Doctor doctor;

    private int patientAge;

    // Карточка
    private Map<Diagnosis, String> diagnosis = new TreeMap<Diagnosis, String>();
    private Map<Anamnesis, String> anamnesis = new TreeMap<Anamnesis, String>();
    private Map<Debut, String> debut = new TreeMap<Debut, String>();
    private Map<Convulsion, String> convulsions = new TreeMap<Convulsion, String>();

    private Map<Syndrome, String> syndromes = new TreeMap<Syndrome, String>();
    private Map<Nevrostatus, String> nevrostatus = new TreeMap<Nevrostatus, String>();
    private Map<Analysis, String> analysis = new TreeMap<Analysis, String>();
    private Map<Research, String> research = new TreeMap<Research, String>();

    private Map<Recommendation, String> recommendations = new TreeMap<Recommendation, String>();
    private Set<MedicineGroup> medicineGroups = new TreeSet<MedicineGroup>();
    private Map<Treatment, String> treatment = new TreeMap<Treatment, String>();
    private Map<NegativeEffect, String> effects = new TreeMap<NegativeEffect, String>();
    private String summary;

    public Record() {
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public Map<Diagnosis, String> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Map<Diagnosis, String> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Map<Anamnesis, String> getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(Map<Anamnesis, String> anamnesis) {
        this.anamnesis = anamnesis;
    }

    public Map<Debut, String> getDebut() {
        return debut;
    }

    public void setDebut(Map<Debut, String> debut) {
        this.debut = debut;
    }

    public Map<Convulsion, String> getConvulsions() {
        return convulsions;
    }

    public void setConvulsions(Map<Convulsion, String> convulsions) {
        this.convulsions = convulsions;
    }

    public Map<Syndrome, String> getSyndromes() {
        return syndromes;
    }

    public void setSyndromes(Map<Syndrome, String> syndromes) {
        this.syndromes = syndromes;
    }

    public Map<Nevrostatus, String> getNevrostatus() {
        return nevrostatus;
    }

    public void setNevrostatus(Map<Nevrostatus, String> nevrostatus) {
        this.nevrostatus = nevrostatus;
    }

    public Map<Analysis, String> getAnalysis() {
        return analysis;
    }

    public void setAnalysis(Map<Analysis, String> analysis) {
        this.analysis = analysis;
    }

    public Map<Research, String> getResearch() {
        return research;
    }

    public void setResearch(Map<Research, String> research) {
        this.research = research;
    }

    public Map<Recommendation, String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Map<Recommendation, String> recommendations) {
        this.recommendations = recommendations;
    }

    public Set<MedicineGroup> getMedicineGroups() {
        return medicineGroups;
    }

    public void setMedicineGroups(Set<MedicineGroup> medicineGroups) {
        this.medicineGroups = medicineGroups;
    }

    public Map<Treatment, String> getTreatment() {
        return treatment;
    }

    public void setTreatment(Map<Treatment, String> treatment) {
        this.treatment = treatment;
    }

    public Map<NegativeEffect, String> getEffects() {
        return effects;
    }

    public void setEffects(Map<NegativeEffect, String> effects) {
        this.effects = effects;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
