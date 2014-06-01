package org.pacard.entityRecord;

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
    private int SideEffectID;

    private String SideEffectName;

    @ManyToMany(mappedBy = "effects")
    @JoinTable(name = "GROUPS_EFFECTS")
    private Set<MedicineGroup> groups;

}

