package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class AnalysisDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long analysisDescriptionID;

    private String analysisDescriptionName;

    @OneToOne
    @JoinColumn(name="analysisTypeId")
    private AnalysisType analysisType;

    public AnalysisDescription() {
    }

    public Long getAnalysisDescriptionID() {
        return analysisDescriptionID;
    }

    public void setAnalysisDescriptionID(Long analysisDescriptionID) {
        this.analysisDescriptionID = analysisDescriptionID;
    }

    public String getAnalysisDescriptionName() {
        return analysisDescriptionName;
    }

    public void setAnalysisDescriptionName(String analysisDescriptionName) {
        this.analysisDescriptionName = analysisDescriptionName;
    }

    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnalysisDescription)) return false;

        AnalysisDescription that = (AnalysisDescription) o;

        if (!analysisDescriptionName.equals(that.analysisDescriptionName)) return false;
        if (!analysisType.equals(that.analysisType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = analysisDescriptionName.hashCode();
        result = 31 * result + analysisType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AnalysisDescription{" +
                "analysisDescriptionID=" + analysisDescriptionID +
                ", analysisDescriptionName='" + analysisDescriptionName + '\'' +
                ", analysisType=" + analysisType +
                '}';
    }
}

