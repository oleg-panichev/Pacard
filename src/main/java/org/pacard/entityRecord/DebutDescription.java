package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="DEBUT_DESCRIPTION")
public class DebutDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DebutDescriptionID;

    private String DebutDescriptionName;
    @ManyToOne
    @JoinColumn(name="DEBUT_TYPE_ID")
    private DebutType debutType;
}
