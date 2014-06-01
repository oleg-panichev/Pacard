package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
@Table(name="MEDICINE")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MedicineID;

    private String MedicineName;

    @ManyToOne
    @JoinColumn(name="MEDICINE_GROUP_ID")
    private MedicineGroup medicineGroup;

    @ManyToOne
    @JoinColumn(name = "TREATMENT_TYPE_ID")
    private TreatmentType treatmentType;
}