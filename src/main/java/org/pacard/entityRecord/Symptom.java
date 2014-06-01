package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="SYMPTOM")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int symptomID;
    private String symptomName;

    @ManyToOne
    @JoinColumn(name="syndromeTypeID")
    private SyndromeType syndromeType;
}




