package goldrush;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 * A digger that rotates among the digging sites.
 * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class RotatingDigger extends GoldDigger {
    int days;  // Contatore dei giorni
    
    /**
     * Constructor.
     */
    RotatingDigger() {
        days = 0;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        int chosen = days % distances.length;
        days++;
        return chosen;
    }
}
