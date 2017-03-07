/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Random;

/**
 *
 * @author Carolina Bianchi mat 427917
 */
public class BianchiCarolina extends GoldDigger {

    private int day;
    private int index1fa;
    private int index2fa;
    private int[] revenues;
    private double[] sumRevenues;
    private static final int N_SITES = GoldRush.SITE_DISTANCES.length;
    private static final int N_DAYS = GoldRush.DEFAULT_DAYS;

    public BianchiCarolina() {
        day = 0;
        this.index1fa = 0;
        this.index2fa = 0;
        this.revenues = new int[N_SITES];
        this.sumRevenues = new double[N_SITES];
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        return bestPastDay(distances);
    }

    private int bestPastDay(int[] distances) {

        int tmp = 0;
        for (int i = 0; i < N_SITES; i++) {

            sumRevenues[i] = (sumRevenues[i])*0.8  + revenues[i];
            if (sumRevenues[i] > sumRevenues[index2fa]) {
                index2fa = index1fa;
                index1fa = i;
            }
        }

        if (day == 0 || day == 1) {
            return 3;
        }

        return index2fa;

    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {

        for (int i = 0; i < distances.length; i++) {
            this.revenues[i] = Town.computeSiteRevenue(distances[i], diggers[i] + 1);
        }

        day++;
    }

}
