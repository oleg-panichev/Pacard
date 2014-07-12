package com.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */
public class Debut {
    private DebutType type;
    private DebutDescription description;

    private int ageYear;
    private int ageMonth;

    private int durationSec;
    private int durationMin;

    public DebutType getType() {
        return type;
    }

    public void setType(DebutType type) {
        this.type = type;
    }

    public DebutDescription getDescription() {
        return description;
    }

    public void setDescription(DebutDescription description) {
        this.description = description;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    public int getDurationSec() {
        return durationSec;
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public Debut() {
    }

    @Override
    public String toString() {
        return "Debut{" +
                "type=" + type +
                ", description=" + description +
                ", ageYear=" + ageYear +
                ", ageMonth=" + ageMonth +
                ", durationSec=" + durationSec +
                ", durationMin=" + durationMin +
                '}';
    }
}
