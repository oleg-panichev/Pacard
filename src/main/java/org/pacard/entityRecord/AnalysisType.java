package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="ANALYSIS_TYPE")
public class AnalysisType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ANALYSIS_TYPE_ID")
    private int analysisTypeID;

    private String analysisTypeName;

    @OneToMany(mappedBy="analysisType", fetch = FetchType.EAGER)
    private Set<AnalysisDescription> descriptions;

    public AnalysisType() {
    }

    public int getAnalysisTypeID() {
        return analysisTypeID;
    }

    public void setAnalysisTypeID(int analysisTypeID) {
        analysisTypeID = analysisTypeID;
    }

    public String getAnalysisTypeName() {
        return analysisTypeName;
    }

    public void setAnalysisTypeName(String analysisTypeName) {
        analysisTypeName = analysisTypeName;
    }

    public Set<AnalysisDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Set<AnalysisDescription> descriptions) {
        this.descriptions = descriptions;
    }
}
