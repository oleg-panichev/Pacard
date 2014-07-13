package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class NeurostatusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nevrostatusTypeId;

    private String nevrostatusTypeName;

    @OneToOne(mappedBy="nevrostatusType", fetch = FetchType.EAGER)
    private NeurostatusDescription description;

    public NeurostatusType() {
    }

    public Long getNevrostatusTypeId() {
        return nevrostatusTypeId;
    }

    public void setNevrostatusTypeId(Long nevrostatusTypeId) {
        this.nevrostatusTypeId = nevrostatusTypeId;
    }

    public String getNevrostatusTypeName() {
        return nevrostatusTypeName;
    }

    public void setNevrostatusTypeName(String nevrostatusTypeName) {
        this.nevrostatusTypeName = nevrostatusTypeName;
    }

    public NeurostatusDescription getDescription() {
        return description;
    }

    public void setDescription(NeurostatusDescription description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NeurostatusType)) return false;

        NeurostatusType that = (NeurostatusType) o;

        if (!nevrostatusTypeName.equals(that.nevrostatusTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return nevrostatusTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "NeurostatusType{" +
                "nevrostatusTypeId=" + nevrostatusTypeId +
                ", nevrostatusTypeName='" + nevrostatusTypeName + '\'' +
                ", description=" + description +
                '}';
    }
}

