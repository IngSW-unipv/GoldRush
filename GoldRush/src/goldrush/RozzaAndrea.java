/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

/**
 *
 * @author cl421033
 */
public class RozzaAndrea extends GoldDigger {
    
    private int days;
    private int posizione;
    
    public RozzaAndrea() {
        days = 0;
        posizione = 0;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        days++;
        return this.posizione;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        int[] soldi = new int[distances.length];
        int[] num_dig = new int[soldi.length];
        for(int i = 0; i < soldi.length; i++) {
            if (diggers[i] != 0) {
                soldi[i] = 5 * ((12 - (distances[i] / 30))) / diggers[i];
                num_dig[i] = diggers[i];
            }
            else {
                soldi[i] = 1000;
                num_dig[i] = 0;
            }
        }
        int min = num_dig[0];
        int pos = 0;
        for(int i = 1; i < soldi.length; i++) {
            if (soldi[i] > min) {
                min = num_dig[i];
                pos = i;
            }
        }
        int max = soldi[5];
        for(int i = 0; i < soldi.length - 1; i++) {
            if (soldi[i] > max) {
                max = soldi[i];
                if (pos == i)
                    this.posizione = i;
                else
                    this.posizione = (days % 2) == 0 ? 1 : 3;
                    
            }
        }
    }   
}
