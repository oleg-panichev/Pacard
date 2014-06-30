package com.pacard.entityRecord;

/**
 * Created by Алена on 01.06.14.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "TREATMENT_TYPE")
public class TreatmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TREATMENT_TYPE_ID")
    private Long treatmentTypeID;

    private String treatmentTypeName;
    @OneToMany(mappedBy="treatmentType", fetch = FetchType.EAGER)
    private Set<Medicine> medicines;

    public TreatmentType() {
    }

    public Long getTreatmentTypeID() {
        return treatmentTypeID;
    }

    public void setTreatmentTypeID(Long treatmentTypeID) {
        treatmentTypeID = treatmentTypeID;
    }

    public String getTreatmentTypeName() {
        return treatmentTypeName;
    }

    public void setTreatmentTypeName(String treatmentTypeName) {
        treatmentTypeName = treatmentTypeName;
    }

    public Set<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicine> medicines) {
        this.medicines = medicines;
    }
}
