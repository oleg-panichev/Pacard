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
    private int ResearchTypeID;

    private String ResearchTypeName;

    @OneToMany(mappedBy="researchType", fetch = FetchType.EAGER)
    private Set<ResearchDescription> descriptions;
}

