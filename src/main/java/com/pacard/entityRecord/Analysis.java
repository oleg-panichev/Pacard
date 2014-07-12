package com.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */
public class Analysis {
    private AnalysisType type;
    private AnalysisDescription description;

    public Analysis() {
    }

    public AnalysisType getType() {
        return type;
    }

    public void setType(AnalysisType type) {
        this.type = type;
    }

    public AnalysisDescription getDescription() {
        return description;
    }

    public void setDescription(AnalysisDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Analysis{" +
                "type=" + type +
                ", description=" + description +
                '}';
    }
}
