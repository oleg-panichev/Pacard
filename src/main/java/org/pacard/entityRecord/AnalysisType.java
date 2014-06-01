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
    private int AnalysisTypeID;

    private String AnalysisTypeName;

    @OneToMany(mappedBy="analysisType", fetch = FetchType.EAGER)
    private Set<AnalysisDescription> descriptions;
}
