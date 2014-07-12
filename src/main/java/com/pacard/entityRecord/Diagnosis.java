package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diagnosisId;
    private String diagnosisName;

    public Diagnosis() {
    }

    public Long getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(Long diagnosisID) {
        this.diagnosisId = diagnosisId;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Diagnosis)) return false;

        Diagnosis diagnosis = (Diagnosis) o;

        if (!diagnosisName.equals(diagnosis.diagnosisName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return diagnosisName.hashCode();
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "diagnosisID=" + diagnosisId +
                ", diagnosisName='" + diagnosisName + '\'' +
                '}';
    }
}
