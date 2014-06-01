package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="DIAGNOSIS")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diagnosisID;
    private String diagnosisName;

}
