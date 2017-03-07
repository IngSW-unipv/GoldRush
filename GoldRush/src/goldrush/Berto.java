/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
// Nicholas Farina (428444) & Alberto Groppi (426653)
package goldrush;

/**
 *
 * @author cl428444
 */
public class Berto extends GoldDigger{
    private int giorno_attuale = 0;
    

    @Override
    public int chooseDiggingSite(int[] distances) {
        return 4;
    }
    
}
