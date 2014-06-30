package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="DEBUT_DESCRIPTION")
public class DebutDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long debutDescriptionID;

    private String debutDescriptionName;
    @ManyToOne
    @JoinColumn(name="DEBUT_TYPE_ID")
    private DebutType debutType;

    public DebutDescription() {
    }

    public Long getDebutDescriptionID() {
        return debutDescriptionID;
    }

    public void setDebutDescriptionID(Long debutDescriptionID) {
        debutDescriptionID = debutDescriptionID;
    }

    public String getDebutDescriptionName() {
        return debutDescriptionName;
    }

    public void setDebutDescriptionName(String debutDescriptionName) {
        debutDescriptionName = debutDescriptionName;
    }

    public DebutType getDebutType() {
        return debutType;
    }

    public void setDebutType(DebutType debutType) {
        this.debutType = debutType;
    }
}
