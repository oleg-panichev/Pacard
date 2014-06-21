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
    @Column(name = "MEDICINE_GROUP_ID")
    private int medicineGroupID;

    private String medicineGroupName;

    @OneToMany(mappedBy="medicineGroup", fetch = FetchType.EAGER)
    private Set<Medicine> medicines;

    @ManyToMany
    @JoinTable(name = "GROUPS_EFFECTS", joinColumns = { @JoinColumn(name = "SIDE_EFFECT_ID") },
            inverseJoinColumns = { @JoinColumn(name = "MEDICINE_GROUP_ID") })
    private Set<SideEffect> effects;

    public MedicineGroup() {
    }

    public int getMedicineGroupID() {
        return medicineGroupID;
    }

    public void setMedicineGroupID(int medicineGroupID) {
        medicineGroupID = medicineGroupID;
    }

    public String getMedicineGroupName() {
        return medicineGroupName;
    }

    public void setMedicineGroupName(String medicineGroupName) {
        medicineGroupName = medicineGroupName;
    }

    public Set<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicine> medicines) {
        this.medicines = medicines;
    }

    public Set<SideEffect> getEffects() {
        return effects;
    }

    public void setEffects(Set<SideEffect> effects) {
        this.effects = effects;
    }
}
