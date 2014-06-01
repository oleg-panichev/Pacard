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
    private int ResearchDescriptionID;

    private String ResearchDescriptionName;

    @ManyToOne
    @JoinColumn(name="RESEARCH_TYPE_ID")
    private ResearchType researchType;
}


