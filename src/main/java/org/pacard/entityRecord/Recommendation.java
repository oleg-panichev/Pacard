package org.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
@Table(name="RECOMMENDATION")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recommendationID;
    private String recommendationName;
}
