package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="RESEARCH_DESCRIPTION")
public class ResearchDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int researchDescriptionID;

    private String researchDescriptionName;

    @ManyToOne
    @JoinColumn(name="RESEARCH_TYPE_ID")
    private ResearchType researchType;

    public ResearchDescription() {
    }

    public int getResearchDescriptionID() {
        return researchDescriptionID;
    }

    public void setResearchDescriptionID(int researchDescriptionID) {
        researchDescriptionID = researchDescriptionID;
    }

    public String getResearchDescriptionName() {
        return researchDescriptionName;
    }

    public void setResearchDescriptionName(String researchDescriptionName) {
        researchDescriptionName = researchDescriptionName;
    }

    public ResearchType getResearchType() {
        return researchType;
    }

    public void setResearchType(ResearchType researchType) {
        this.researchType = researchType;
    }
}


