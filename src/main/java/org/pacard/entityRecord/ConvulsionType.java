package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="CONVULSION")
public class ConvulsionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ConvulsionTypeID;
    private String ConvulsionTypeName;
}
