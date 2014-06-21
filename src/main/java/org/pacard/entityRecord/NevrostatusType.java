package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEVROSTATUS_TYPE")
public class NevrostatusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NEVROSTATUS_TYPE_ID")
    private int nevrostatusTypeID;

    private String nevrostatusTypeName;

    @OneToMany(mappedBy="nevrostatusType", fetch = FetchType.EAGER)
    private Set<NevrostatusDescription> descriptions;

    public NevrostatusType() {
    }

    public int getNevrostatusTypeID() {
        return nevrostatusTypeID;
    }

    public void setNevrostatusTypeID(int nevrostatusTypeID) {
        nevrostatusTypeID = nevrostatusTypeID;
    }

    public String getNevrostatusTypeName() {
        return nevrostatusTypeName;
    }

    public void setNevrostatusTypeName(String nevrostatusTypeName) {
        nevrostatusTypeName = nevrostatusTypeName;
    }

    public Set<NevrostatusDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<NevrostatusDescription> descriptions) {
        this.descriptions = descriptions;
    }
}

