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
    @Column
    private int AnalysisDescriptionID;

    private String AnalysisDescriptionName;

    @ManyToOne
    @JoinColumn(name = "ANALYSIS_TYPE_ID")
    private AnalysisType analysisType;
}

