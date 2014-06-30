package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="DIAGNOSIS")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diagnosisID;
    private String diagnosisName;

    public Diagnosis() {
    }

    public Long getDiagnosisID() {
        return diagnosisID;
    }

    public void setDiagnosisID(Long diagnosisID) {
        this.diagnosisID = diagnosisID;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }
}
