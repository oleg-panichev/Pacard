package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
@Table(name="CONVULSION")
public class ConvulsionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long convulsionTypeID;
    private String convulsionTypeName;

    public ConvulsionType() {
    }

    public Long getConvulsionTypeID() {
        return convulsionTypeID;
    }

    public void setConvulsionTypeID(Long convulsionTypeID) {
        convulsionTypeID = convulsionTypeID;
    }

    public String getConvulsionTypeName() {
        return convulsionTypeName;
    }

    public void setConvulsionTypeName(String convulsionTypeName) {
        convulsionTypeName = convulsionTypeName;
    }
}
