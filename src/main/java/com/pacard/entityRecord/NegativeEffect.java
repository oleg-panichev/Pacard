package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEGATIVE_EFFECT")
public class NegativeEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long negativeEffectID;
    private String negativeEffectName;

    public NegativeEffect() {
    }

    public Long getNegativeEffectID() {
        return negativeEffectID;
    }

    public void setNegativeEffectID(Long negativeEffectID) {
        negativeEffectID = negativeEffectID;
    }

    public String getNegativeEffectName() {
        return negativeEffectName;
    }

    public void setNegativeEffectName(String negativeEffectName) {
        negativeEffectName = negativeEffectName;
    }
}