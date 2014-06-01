package org.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="DEBUT_TYPE")
public class DebutType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DebutTypeID;

    private String DebutTypeName;
    @OneToMany(mappedBy="debutType", fetch = FetchType.EAGER)
    private Set<DebutDescription> descriptions;
}
