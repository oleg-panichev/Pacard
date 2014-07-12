package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class NegativeFactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long negativeFactorId;
    private String negativeFactorName;

    public NegativeFactor() {
    }

    public Long getNegativeFactorId() {
        return negativeFactorId;
    }

    public void setNegativeFactorId(Long negativeFactorId) {
        negativeFactorId = negativeFactorId;
    }

    public String getNegativeFactorName() {
        return negativeFactorName;
    }

    public void setNegativeFactorName(String negativeFactorName) {
        negativeFactorName = negativeFactorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NegativeFactor)) return false;

        NegativeFactor that = (NegativeFactor) o;

        if (!negativeFactorName.equals(that.negativeFactorName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return negativeFactorName.hashCode();
    }

    @Override
    public String toString() {
        return "NegativeFactor{" +
                "negativeFactorId=" + negativeFactorId +
                ", negativeFactorName='" + negativeFactorName + '\'' +
                '}';
    }
}
