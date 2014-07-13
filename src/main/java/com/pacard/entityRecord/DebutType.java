package com.pacard.entityRecord;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Алена on 31.05.14.
 */
@Entity
public class DebutType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long debutTypeId;

    private String debutTypeName;

    @OneToOne(mappedBy="debutType", fetch = FetchType.LAZY)
    private DebutDescription description;

    public DebutType() {
    }

    public Long getDebutTypeId() {
        return debutTypeId;
    }

    public void setDebutTypeId(Long debutTypeId) {
        this.debutTypeId = debutTypeId;
    }

    public String getDebutTypeName() {
        return debutTypeName;
    }

    public void setDebutTypeName(String debutTypeName) {
        this.debutTypeName = debutTypeName;
    }

    public DebutDescription getDescription() {
        return description;
    }

    public void setDescription(DebutDescription description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DebutType)) return false;

        DebutType debutType = (DebutType) o;

        if (!debutTypeName.equals(debutType.debutTypeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return debutTypeName.hashCode();
    }

    @Override
    public String toString() {
        return "DebutType{" +
                "debutTypeID=" + debutTypeId +
                ", debutTypeName='" + debutTypeName + '\'' +
                ", description=" + description +
                '}';
    }

}
