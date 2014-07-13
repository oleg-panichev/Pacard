package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class ResearchType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long researchTypeId;

    private String researchTypeName;

    @OneToOne(mappedBy="researchType", fetch = FetchType.LAZY)
    private ResearchDescription description;

    public ResearchType() {
    }

    public Long getResearchTypeId() {
        return researchTypeId;
    }

    public void setResearchTypeId(Long researchTypeId) {
        this.researchTypeId = researchTypeId;
    }

    public String getResearchTypeName() {
        return researchTypeName;
    }

    public void setResearchTypeName(String researchTypeName) {
        this.researchTypeName = researchTypeName;
    }

    public ResearchDescription getDescription() {
        return description;
    }

    public void setDescription(ResearchDescription description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResearchType)) return false;

        ResearchType that = (ResearchType) o;

        if (!researchTypeName.equals(that.researchTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return researchTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "ResearchType{" +
                "researchTypeId=" + researchTypeId +
                ", researchTypeName='" + researchTypeName + '\'' +
                ", description=" + description +
                '}';
    }
}

