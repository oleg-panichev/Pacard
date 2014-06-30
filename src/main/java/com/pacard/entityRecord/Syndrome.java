package org.pacard.entityRecord;

/**
 * Created by Oleg on 30.05.14.
 */
public class Syndrome {
    private SyndromeType type;

    private int durationInt;
    public enum Duration {MINUTES, SECONDS};

    private int frequencyInt;
    public enum Frequency {DAY, WEEK, MONTH, YEAR};
}
