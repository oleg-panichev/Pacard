package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class SyndromeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long syndromeTypeId;

    private String syndromeTypeName;

    @OneToOne(mappedBy="syndromeType", fetch = FetchType.LAZY)
    private Symptom symptom;

    public SyndromeType() {
    }

    public Long getSyndromeTypeId() {
        return syndromeTypeId;
    }

    public void setSyndromeTypeId(Long syndromeTypeId) {
        this.syndromeTypeId = syndromeTypeId;
    }

    public String getSyndromeTypeName() {
        return syndromeTypeName;
    }

    public void setSyndromeTypeName(String syndromeTypeName) {
        this.syndromeTypeName = syndromeTypeName;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SyndromeType)) return false;

        SyndromeType that = (SyndromeType) o;

        if (!syndromeTypeName.equals(that.syndromeTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return syndromeTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "SyndromeType{" +
                "syndromeTypeId=" + syndromeTypeId +
                ", syndromeTypeName='" + syndromeTypeName + '\'' +
                ", symptom=" + symptom +
                '}';
    }
}




