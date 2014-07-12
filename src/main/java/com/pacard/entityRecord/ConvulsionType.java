package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class ConvulsionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long convulsionTypeId;
    private String convulsionTypeName;

    public ConvulsionType() {
    }

    public Long getConvulsionTypeId() {
        return convulsionTypeId;
    }

    public void setConvulsionTypeId(Long convulsionTypeId) {
        convulsionTypeId = convulsionTypeId;
    }

    public String getConvulsionTypeName() {
        return convulsionTypeName;
    }

    public void setConvulsionTypeName(String convulsionTypeName) {
        convulsionTypeName = convulsionTypeName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConvulsionType)) return false;

        ConvulsionType that = (ConvulsionType) o;

        if (!convulsionTypeName.equals(that.convulsionTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return convulsionTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "ConvulsionType{" +
                "convulsionTypeID=" + convulsionTypeId +
                ", convulsionTypeName='" + convulsionTypeName + '\'' +
                '}';
    }
}
