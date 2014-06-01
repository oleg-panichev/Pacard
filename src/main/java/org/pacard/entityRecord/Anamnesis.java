package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="ANAMNESIS")
public class Anamnesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int anamnesisID;
    private String anamnesisName;
}
