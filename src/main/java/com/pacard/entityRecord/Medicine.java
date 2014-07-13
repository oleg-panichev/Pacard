package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 01.06.14.
 */
@Entity

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineId;

    private String medicineName;

    @OneToOne
    @JoinColumn(name="medicineGroupId")
    private MedicineGroup medicineGroup;

    @OneToOne
    @JoinColumn(name = "treatmentTypeId")
    private TreatmentType treatmentType;

    public Medicine() {
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public MedicineGroup getMedicineGroup() {
        return medicineGroup;
    }

    public void setMedicineGroup(MedicineGroup medicineGroup) {
        this.medicineGroup = medicineGroup;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicine)) return false;

        Medicine medicine = (Medicine) o;

        if (!medicineGroup.equals(medicine.medicineGroup)) return false;
        if (!medicineName.equals(medicine.medicineName)) return false;
        if (!treatmentType.equals(medicine.treatmentType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medicineName.hashCode();
        result = 31 * result + medicineGroup.hashCode();
        result = 31 * result + treatmentType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", medicineGroup=" + medicineGroup +
                ", treatmentType=" + treatmentType +
                '}';
    }
}