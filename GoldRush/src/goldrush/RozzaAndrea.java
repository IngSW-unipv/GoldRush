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
    
    public RozzaAndrea() {
        days = 0;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        int posizione = 0;
        if (days == 0)
            posizione = 3;
        else
            posizione = (2 * days) % distances.length;
        days++;
        return posizione;
    }
    
}
