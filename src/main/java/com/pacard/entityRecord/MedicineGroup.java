package com.pacard.entityRecord;

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
    private Long medicineGroupID;

    private String medicineGroupName;

    @OneToMany(mappedBy="medicineGroup", fetch = FetchType.EAGER)
    private Set<Medicine> medicines;

    @ManyToMany
    @JoinTable(name = "GROUPS_EFFECTS", joinColumns = { @JoinColumn(name = "SIDE_EFFECT_ID") },
            inverseJoinColumns = { @JoinColumn(name = "MEDICINE_GROUP_ID") })
    private Set<SideEffect> effects;

    public MedicineGroup() {
    }

    public Long getMedicineGroupID() {
        return medicineGroupID;
    }

    public void setMedicineGroupID(Long medicineGroupID) {
        this.medicineGroupID = medicineGroupID;
    }

    public String getMedicineGroupName() {
        return medicineGroupName;
    }

    public void setMedicineGroupName(String medicineGroupName) {
        this.medicineGroupName = medicineGroupName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicineGroup)) return false;

        MedicineGroup that = (MedicineGroup) o;

        if (!medicineGroupName.equals(that.medicineGroupName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return medicineGroupName.hashCode();
    }

    @Override
    public String toString() {
        return "MedicineGroup{" +
                "medicineGroupID=" + medicineGroupID +
                ", medicineGroupName='" + medicineGroupName + '\'' +
                ", medicines=" + medicines +
                ", effects=" + effects +
                '}';
    }
}
