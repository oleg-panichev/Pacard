package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class ResearchDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long researchDescriptionId;

    private String researchDescriptionName;

    @OneToOne
    @JoinColumn(name="researchTypeId")
    private ResearchType researchType;

    public ResearchDescription() {
    }

    public Long getResearchDescriptionId() {
        return researchDescriptionId;
    }

    public void setResearchDescriptionId(Long researchDescriptionId) {
        this.researchDescriptionId = researchDescriptionId;
    }

    public String getResearchDescriptionName() {
        return researchDescriptionName;
    }

    public void setResearchDescriptionName(String researchDescriptionName) {
        this.researchDescriptionName = researchDescriptionName;
    }

    public ResearchType getResearchType() {
        return researchType;
    }

    public void setResearchType(ResearchType researchType) {
        this.researchType = researchType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResearchDescription)) return false;

        ResearchDescription that = (ResearchDescription) o;

        if (!researchDescriptionName.equals(that.researchDescriptionName)) return false;
        if (!researchType.equals(that.researchType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = researchDescriptionName.hashCode();
        result = 31 * result + researchType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ResearchDescription{" +
                "researchDescriptionId=" + researchDescriptionId +
                ", researchDescriptionName='" + researchDescriptionName + '\'' +
                ", researchType=" + researchType +
                '}';
    }
}


