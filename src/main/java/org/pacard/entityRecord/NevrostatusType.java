package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="NEVROSTATUS_TYPE")
public class NevrostatusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NevrostatusTypeID;

    private String NevrostatusTypeName;

    @OneToMany(mappedBy="nevrostatusType", fetch = FetchType.EAGER)
    private Set<NevrostatusDescription> descriptions;
}

