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
    int site;
    
    RotatingDigger() {
        super("RotatingDigger");
        site = 0;  // start from the first site
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        int chosen = site;
        site++;  // Next time choose the next site 
        if (site >= distances.length)
            site = 0;  // When finished, restart from the first one
        return chosen;
    }
}
