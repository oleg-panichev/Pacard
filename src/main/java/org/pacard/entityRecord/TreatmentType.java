package org.pacard.entityRecord;

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
    private int TreatmentTypeID;

    private String TreatmentTypeName;
    @OneToMany(mappedBy="treatmentType", fetch = FetchType.EAGER)
    private Set<Medicine> medicines;
}
