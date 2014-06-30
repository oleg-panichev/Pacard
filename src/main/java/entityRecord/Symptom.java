package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="SYMPTOM")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long symptomID;
    private String symptomName;

    @ManyToOne
    @JoinColumn(name="SYNDROME_TYPE_ID")
    private SyndromeType syndromeType;

    public Symptom() {
    }

    public Long getSymptomID() {
        return symptomID;
    }

    public void setSymptomID(Long symptomID) {
        this.symptomID = symptomID;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public SyndromeType getSyndromeType() {
        return syndromeType;
    }

    public void setSyndromeType(SyndromeType syndromeType) {
        this.syndromeType = syndromeType;
    }
}




