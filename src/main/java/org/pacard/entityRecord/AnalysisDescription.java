package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="ANALYSIS_DESCRIPTION")
public class AnalysisDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnalysisDescriptionID;

    private String AnalysisDescriptionName;

    @ManyToOne
    @JoinColumn(name="analysisTypeID")
    private AnalysisType type;
}

