package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="MEDICINE_GROUP")
public class MedicineGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MedicineGroupID;

    private String MedicineGroupName;
    @OneToMany(mappedBy="medicineGroup", fetch = FetchType.EAGER)
    private Set<Medicine> medicines;
}
