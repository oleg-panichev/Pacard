package com.pacard.entityRecord;

/**
 * Created by Oleg on 30.05.14.
 */
public class Syndrome {
    private SyndromeType type;
    private Symptom symptom;

    private int durationSec;
    private int durationMin;

    private int frequencyDay;
    private int frequencyWeek;
    private int frequencyMonth;
    private int frequencyYear;

    public Syndrome() {
    }

    public SyndromeType getType() {
        return type;
    }

    public void setType(SyndromeType type) {
        this.type = type;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
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

    @Override
    public String toString() {
        return "Syndrome{" +
                "type=" + type +
                ", symptom=" + symptom +
                ", durationSec=" + durationSec +
                ", durationMin=" + durationMin +
                ", frequencyDay=" + frequencyDay +
                ", frequencyWeek=" + frequencyWeek +
                ", frequencyMonth=" + frequencyMonth +
                ", frequencyYear=" + frequencyYear +
                '}';
    }
}
