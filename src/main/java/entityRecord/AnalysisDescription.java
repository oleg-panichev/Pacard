package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="ANALYSIS_DESCRIPTION")
public class AnalysisDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long analysisDescriptionID;

    private String analysisDescriptionName;

    @ManyToOne
    @JoinColumn(name = "ANALYSIS_TYPE_ID")
    private AnalysisType analysisType;

    public AnalysisDescription() {
    }

    public Long getAnalysisDescriptionID() {
        return analysisDescriptionID;
    }

    public void setAnalysisDescriptionID(Long analysisDescriptionID) {
        analysisDescriptionID = analysisDescriptionID;
    }

    public String getAnalysisDescriptionName() {
        return analysisDescriptionName;
    }

    public void setAnalysisDescriptionName(String analysisDescriptionName) {
        analysisDescriptionName = analysisDescriptionName;
    }

    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType;
    }
}

