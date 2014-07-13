package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class DebutDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long debutDescriptionId;

    private String debutDescriptionName;

    @OneToOne
    @JoinColumn(name="debutTypeId")
    private DebutType debutType;

    public DebutDescription() {
    }

    public Long getDebutDescriptionId() {
        return debutDescriptionId;
    }

    public void setDebutDescriptionId(Long debutDescriptionId) {
        this.debutDescriptionId = debutDescriptionId;
    }

    public String getDebutDescriptionName() {
        return debutDescriptionName;
    }

    public void setDebutDescriptionName(String debutDescriptionName) {
        this.debutDescriptionName = debutDescriptionName;
    }

    public DebutType getDebutType() {
        return debutType;
    }

    public void setDebutType(DebutType debutType) {
        this.debutType = debutType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DebutDescription)) return false;

        DebutDescription that = (DebutDescription) o;

        if (!debutDescriptionName.equals(that.debutDescriptionName)) return false;
        if (!debutType.equals(that.debutType)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = debutDescriptionName.hashCode();
        result = 31 * result + debutType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DebutDescription{" +
                "debutDescriptionID=" + debutDescriptionId +
                ", debutDescriptionName='" + debutDescriptionName + '\'' +
                ", debutType=" + debutType +
                '}';
    }
}
