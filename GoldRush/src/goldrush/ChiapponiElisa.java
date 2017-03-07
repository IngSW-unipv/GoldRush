/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import static goldrush.GoldRush.DEFAULT_DAYS;

/**
 *
 * @author Elisa Chiapponi(426982)
 */
public class ChiapponiElisa extends GoldDigger {

    private final static int GRAMMI = 5;
    private final static int ORE_LAVORO = 12;
    private final static int MINUTI_ORA = 60;
    private int choosenSite;

    public ChiapponiElisa() {
        //this.choosenSite = 0;

    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        //System.out.println("Sito scelto " + choosenSite);
        return choosenSite;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {

        int digSite = 0;
        float guadagno = 0;
        float guadTmp;

        for (int i = 0; i < diggers.length; i++) {
            guadTmp = GRAMMI * (ORE_LAVORO - 2 * distances[i] / MINUTI_ORA);
            if (diggers[i] != 0) {
                guadTmp = guadTmp / diggers[i];
            }
            // System.out.println("GuadTmp " + guadTmp);
            if (guadTmp > guadagno) {
                guadagno = guadTmp;
                if (i == 0) {
                    digSite = 3;
                } else if ((int) Math.round(Math.random()) == 0) {

                    digSite = i + 1;
                } else {
                    digSite = i - 1;
                }

            }
        }

        setChoosenSite(digSite);

    }

    public void setChoosenSite(int site) {
        this.choosenSite = site;
    }
}
