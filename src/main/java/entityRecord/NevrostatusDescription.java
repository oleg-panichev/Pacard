package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEVROSTATUS_DESCRIPTION")
public class NevrostatusDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nevrostatusDescriptionID;
    private String nevrostatusDescriptionName;

    @ManyToOne
    @JoinColumn(name="NEVROSTATUS_TYPE_ID")
    private NevrostatusType nevrostatusType;

    public NevrostatusDescription() {
    }

    public Long getNevrostatusDescriptionID() {
        return nevrostatusDescriptionID;
    }

    public void setNevrostatusDescriptionID(Long nevrostatusDescriptionID) {
        nevrostatusDescriptionID = nevrostatusDescriptionID;
    }

    public String getNevrostatusDescriptionName() {
        return nevrostatusDescriptionName;
    }

    public void setNevrostatusDescriptionName(String nevrostatusDescriptionName) {
        nevrostatusDescriptionName = nevrostatusDescriptionName;
    }

    public NevrostatusType getNevrostatusType() {
        return nevrostatusType;
    }

    public void setNevrostatusType(NevrostatusType nevrostatusType) {
        this.nevrostatusType = nevrostatusType;
    }
}


