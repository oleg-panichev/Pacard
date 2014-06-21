package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="RESEARCH_TYPE")
public class ResearchType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESEARCH_TYPE_ID")
    private int researchTypeID;

    private String researchTypeName;

    @OneToMany(mappedBy="researchType", fetch = FetchType.EAGER)
    private Set<ResearchDescription> descriptions;

    public ResearchType() {
    }

    public int getResearchTypeID() {
        return researchTypeID;
    }

    public void setResearchTypeID(int researchTypeID) {
        researchTypeID = researchTypeID;
    }

    public String getResearchTypeName() {
        return researchTypeName;
    }

    public void setResearchTypeName(String researchTypeName) {
        researchTypeName = researchTypeName;
    }

    public Set<ResearchDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<ResearchDescription> descriptions) {
        this.descriptions = descriptions;
    }
}

