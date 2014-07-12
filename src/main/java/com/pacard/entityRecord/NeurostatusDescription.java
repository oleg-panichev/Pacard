package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class NeurostatusDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nevrostatusDescriptionId;

    private String nevrostatusDescriptionName;

    @OneToOne
    @JoinColumn(name="neurostatusTypeId")
    private NeurostatusType neurostatusType;

    public NeurostatusDescription() {
    }

    public Long getNevrostatusDescriptionId() {
        return nevrostatusDescriptionId;
    }

    public void setNevrostatusDescriptionId(Long nevrostatusDescriptionId) {
        nevrostatusDescriptionId = nevrostatusDescriptionId;
    }

    public String getNevrostatusDescriptionName() {
        return nevrostatusDescriptionName;
    }

    public void setNevrostatusDescriptionName(String nevrostatusDescriptionName) {
        nevrostatusDescriptionName = nevrostatusDescriptionName;
    }

    public NeurostatusType getNeurostatusType() {
        return neurostatusType;
    }

    public void setNeurostatusType(NeurostatusType neurostatusType) {
        this.neurostatusType = neurostatusType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NeurostatusDescription)) return false;

        NeurostatusDescription that = (NeurostatusDescription) o;

        if (!nevrostatusDescriptionName.equals(that.nevrostatusDescriptionName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return nevrostatusDescriptionName.hashCode();
    }

    @Override
    public String toString() {
        return "NeurostatusDescription{" +
                "nevrostatusDescriptionId=" + nevrostatusDescriptionId +
                ", nevrostatusDescriptionName='" + nevrostatusDescriptionName + '\'' +
                ", neurostatusType=" + neurostatusType +
                '}';
    }
}


