package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class AnalysisType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long analysisTypeId;

    private String analysisTypeName;

    @OneToOne (fetch = FetchType.LAZY, mappedBy = "analysisType")
    private AnalysisDescription analysisDescription;

    public AnalysisType() {
    }

    public Long getAnalysisTypeId() {
        return analysisTypeId;
    }

    public void setAnalysisTypeId(Long analysisTypeId) {
        this.analysisTypeId = analysisTypeId;
    }

    public String getAnalysisTypeName() {
        return analysisTypeName;
    }

    public void setAnalysisTypeName(String analysisTypeName) {
        this.analysisTypeName = analysisTypeName;
    }

    public AnalysisDescription getAnalysisDescription() {
        return analysisDescription;
    }

    public void setAnalysisDescription(AnalysisDescription analysisDescription) {
        this.analysisDescription = analysisDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnalysisType)) return false;

        AnalysisType that = (AnalysisType) o;

        if (!analysisDescription.equals(that.analysisDescription)) return false;
        if (!analysisTypeName.equals(that.analysisTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = analysisTypeName.hashCode();
        result = 31 * result + analysisDescription.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AnalysisType{" +
                "analysisTypeID=" + analysisTypeId +
                ", analysisTypeName='" + analysisTypeName + '\'' +
                ", analysisDescription=" + analysisDescription +
                '}';
    }
}
