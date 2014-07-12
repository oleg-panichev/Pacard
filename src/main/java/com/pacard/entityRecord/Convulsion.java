package com.pacard.entityRecord;


/**
 * Created by Алена on 31.05.14.
 */
public class Convulsion {
    private ConvulsionType type;

    private int ageYear;
    private int ageMonth;

    private int durationSec;
    private int durationMin;

    private int frequencyDay;
    private int frequencyWeek;
    private int frequencyMonth;
    private int frequencyYear;

    public ConvulsionType getType() {
        return type;
    }

    public void setType(ConvulsionType type) {
        this.type = type;
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

    public int getFrequencyDay() {
        return frequencyDay;
    }

    public void setFrequencyDay(int frequencyDay) {
        this.frequencyDay = frequencyDay;
    }

    public int getFrequencyWeek() {
        return frequencyWeek;
    }

    public void setFrequencyWeek(int frequencyWeek) {
        this.frequencyWeek = frequencyWeek;
    }

    public int getFrequencyMonth() {
        return frequencyMonth;
    }

    public void setFrequencyMonth(int frequencyMonth) {
        this.frequencyMonth = frequencyMonth;
    }

    public int getFrequencyYear() {
        return frequencyYear;
    }

    public void setFrequencyYear(int frequencyYear) {
        this.frequencyYear = frequencyYear;
    }

    public Convulsion() {
    }

    @Override
    public String toString() {
        return "Convulsion{" +
                "type=" + type +
                ", ageYear=" + ageYear +
                ", ageMonth=" + ageMonth +
                ", durationSec=" + durationSec +
                ", durationMin=" + durationMin +
                ", frequencyDay=" + frequencyDay +
                ", frequencyWeek=" + frequencyWeek +
                ", frequencyMonth=" + frequencyMonth +
                ", frequencyYear=" + frequencyYear +
                '}';
    }
}
