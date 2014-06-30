package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
@Table(name="SIDE_EFFECT")
public class SideEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SIDE_EFFECT_ID")
    private Long sideEffectID;

    private String sideEffectName;

    @ManyToMany(mappedBy = "effects")
    @JoinTable(name = "GROUPS_EFFECTS")
    private Set<MedicineGroup> groups;

    public SideEffect() {
    }

    public Long getSideEffectID() {
        return sideEffectID;
    }

    public void setSideEffectID(Long sideEffectID) {
        sideEffectID = sideEffectID;
    }

    public String getSideEffectName() {
        return sideEffectName;
    }

    public void setSideEffectName(String sideEffectName) {
        sideEffectName = sideEffectName;
    }

    public Set<MedicineGroup> getGroups() {
        return groups;
    }

    public void setGroups(Set<MedicineGroup> groups) {
        this.groups = groups;
    }
}

