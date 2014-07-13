package com.pacard.entityRecord;

/**
 * Created by Алена on 01.06.14.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
public class TreatmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long treatmentTypeId;

    private String treatmentTypeName;

    @OneToOne(mappedBy="treatmentType", fetch = FetchType.LAZY)
    private Medicine medicine;

    public TreatmentType() {
    }

    public Long getTreatmentTypeId() {
        return treatmentTypeId;
    }

    public void setTreatmentTypeId(Long treatmentTypeId) {
        this.treatmentTypeId = treatmentTypeId;
    }

    public String getTreatmentTypeName() {
        return treatmentTypeName;
    }

    public void setTreatmentTypeName(String treatmentTypeName) {
        this.treatmentTypeName = treatmentTypeName;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreatmentType)) return false;

        TreatmentType that = (TreatmentType) o;

        if (!treatmentTypeName.equals(that.treatmentTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return treatmentTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "TreatmentType{" +
                "treatmentTypeId=" + treatmentTypeId +
                ", treatmentTypeName='" + treatmentTypeName + '\'' +
                ", medicine=" + medicine +
                '}';
    }
}

