package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
public class SideEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sideEffectId;

    private String sideEffectName;

    @ManyToMany(mappedBy = "effects")
    @JoinTable(name = "MedGroups_SideEffects")
    private Set<MedicineGroup> groups;

    public SideEffect() {
    }

    public Long getSideEffectId() {
        return sideEffectId;
    }

    public void setSideEffectId(Long sideEffectId) {
        this.sideEffectId = sideEffectId;
    }

    public String getSideEffectName() {
        return sideEffectName;
    }

    public void setSideEffectName(String sideEffectName) {
        this.sideEffectName = sideEffectName;
    }

    public Set<MedicineGroup> getGroups() {
        return groups;
    }

    public void setGroups(Set<MedicineGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SideEffect)) return false;

        SideEffect that = (SideEffect) o;

        if (!sideEffectName.equals(that.sideEffectName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return sideEffectName.hashCode();
    }

    @Override
    public String toString() {
        return "SideEffect{" +
                "sideEffectId=" + sideEffectId +
                ", sideEffectName='" + sideEffectName + '\'' +
                ", groups=" + groups +
                '}';
    }
}

