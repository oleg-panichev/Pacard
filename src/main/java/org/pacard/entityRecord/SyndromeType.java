package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="SYNDROME_TYPE")
public class SyndromeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SYNDROME_TYPE_ID")
    private int SyndromeTypeID;

    private String SyndromeTypeName;

    @OneToMany(mappedBy="syndromeType", fetch = FetchType.EAGER)
    private Set<Symptom> symptoms;
}




