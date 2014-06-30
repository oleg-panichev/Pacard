package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="DEBUT_TYPE")
public class DebutType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEBUT_TYPE_ID")
    private Long debutTypeID;

    private String debutTypeName;
    @OneToMany(mappedBy="debutType", fetch = FetchType.EAGER)
    private Set<DebutDescription> descriptions;

    public DebutType() {
    }

    public Long getDebutTypeID() {
        return debutTypeID;
    }

    public void setDebutTypeID(Long debutTypeID) {
        debutTypeID = debutTypeID;
    }

    public String getDebutTypeName() {
        return debutTypeName;
    }

    public void setDebutTypeName(String debutTypeName) {
        debutTypeName = debutTypeName;
    }

    public Set<DebutDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<DebutDescription> descriptions) {
        this.descriptions = descriptions;
    }
}
