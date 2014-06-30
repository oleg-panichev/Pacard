package com.pacard.entityRecord;

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
    private Long syndromeTypeID;

    private String syndromeTypeName;

    @OneToMany(mappedBy="syndromeType", fetch = FetchType.EAGER)
    private Set<Symptom> symptoms;

    public SyndromeType() {
    }

    public Long getSyndromeTypeID() {
        return syndromeTypeID;
    }

    public void setSyndromeTypeID(Long syndromeTypeID) {
        syndromeTypeID = syndromeTypeID;
    }

    public String getSyndromeTypeName() {
        return syndromeTypeName;
    }

    public void setSyndromeTypeName(String syndromeTypeName) {
        syndromeTypeName = syndromeTypeName;
    }

    public Set<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Set<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
}




