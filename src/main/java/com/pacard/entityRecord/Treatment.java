package com.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */

public class Treatment {
    private TreatmentType type;

    int weight;
    int dose;

    public Treatment() {
    }

    public TreatmentType getType() {
        return type;
    }

    public void setType(TreatmentType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "type=" + type +
                ", weight=" + weight +
                ", dose=" + dose +
                '}';
    }
}
