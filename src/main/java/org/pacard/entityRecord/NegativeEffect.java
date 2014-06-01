package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEGATIVE_EFFECT")
public class NegativeEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NegativeEffectID;
    private String NegativeEffectName;
}