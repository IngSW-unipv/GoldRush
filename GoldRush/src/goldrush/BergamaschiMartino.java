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
 * @author cl417911
 */
public class BergamaschiMartino extends GoldDigger {
    /* bergamaschi martino 419084
       barattini daniel 417911    
    */

    Random randomGenerator;
    
    BergamaschiMartino() {
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        // Each site has the same chance of being chosen independently on its distance.
        return randomGenerator.nextInt(distances.length);
    }
    
}