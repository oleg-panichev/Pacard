package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="DIAGNOSIS")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diagnosisID;
    private String diagnosisName;

    public Diagnosis() {
    }

    public int getDiagnosisID() {
        return diagnosisID;
    }

    public void setDiagnosisID(int diagnosisID) {
        this.diagnosisID = diagnosisID;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }
}
