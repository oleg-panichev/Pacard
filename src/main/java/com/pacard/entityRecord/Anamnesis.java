package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class Anamnesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long anamnesisId;
    private String anamnesisName;

    public Anamnesis() {
    }

    public Long getAnamnesisId() {
        return anamnesisId;
    }

    public void setAnamnesisId(Long anamnesisId) {
        this.anamnesisId = anamnesisId;
    }

    public String getAnamnesisName() {
        return anamnesisName;
    }

    public void setAnamnesisName(String anamnesisName) {
        this.anamnesisName = anamnesisName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anamnesis)) return false;

        Anamnesis anamnesis = (Anamnesis) o;

        if (!anamnesisName.equals(anamnesis.anamnesisName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return anamnesisName.hashCode();
    }

    @Override
    public String toString() {
        return "Anamnesis{" +
                "anamnesisID=" + anamnesisId +
                ", anamnesisName='" + anamnesisName + '\'' +
                '}';
    }
}
