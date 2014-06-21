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
    private int convulsionTypeID;
    private String convulsionTypeName;

    public ConvulsionType() {
    }

    public int getConvulsionTypeID() {
        return convulsionTypeID;
    }

    public void setConvulsionTypeID(int convulsionTypeID) {
        convulsionTypeID = convulsionTypeID;
    }

    public String getConvulsionTypeName() {
        return convulsionTypeName;
    }

    public void setConvulsionTypeName(String convulsionTypeName) {
        convulsionTypeName = convulsionTypeName;
    }
}
