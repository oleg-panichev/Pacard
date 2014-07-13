package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long symptomId;
    private String symptomName;

    @OneToOne
    @JoinColumn(name="syndromeTypeId")
    private SyndromeType syndromeType;

    public Symptom() {
    }

    public Long getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(Long symptomId) {
        this.symptomId = symptomId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Symptom)) return false;

        Symptom symptom = (Symptom) o;

        if (!symptomName.equals(symptom.symptomName)) return false;
        if (!syndromeType.equals(symptom.syndromeType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = symptomName.hashCode();
        result = 31 * result + syndromeType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "symptomId=" + symptomId +
                ", symptomName='" + symptomName + '\'' +
                ", syndromeType=" + syndromeType +
                '}';
    }
}




