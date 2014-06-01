package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEVROSTATUS_DESCRIPTION")
public class NevrostatusDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NevrostatusDescriptionID;
    private String NevrostatusDescriptionName;

    @ManyToOne
    @JoinColumn(name="nevrostatusTypeID")
    private NevrostatusType type;
}


