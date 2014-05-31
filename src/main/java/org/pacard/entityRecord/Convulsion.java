package org.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */
public class Convulsion {
    private ConvulsionType type;

    private int ageYear;
    private int ageMonth;

    private int durationInt;
    public enum Duration {MINUTES, SECONDS};

    private int frequencyInt;
    public enum Frequency {DAY, WEEK, MONTH, YEAR};


}
