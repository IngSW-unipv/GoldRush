/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import static goldrush.GoldRush.DEFAULT_DAYS;
import static goldrush.GoldRush.SITE_DISTANCES;
import java.util.Random;

/**
 *
 * @author cl426572
 */
// Marco Guido 427052
// Ludovico Marzagalli 426572
public class LudoMarco extends GoldDigger {

    Random randomGenerator = new Random();
    int days = 0;
    int chosen;

    @Override
    public int chooseDiggingSite(int[] distances) {
        chosen = distances[0];
        days++;
        chosen = distances[0];
        days++;
        chosen = distances[0];
        days++;
        chosen = distances[0];
        days++;
        chosen = distances[0];
        days++;
        chosen = distances[0];
        days++;
     for(days =6; days <= 10 ; days++){ 
        if (days >= 6 ) {
            chosen = randomGenerator.nextInt(distances.length);
           
                int tmp=randomGenerator.nextInt(distances.length);
                    if(tmp != chosen){
                        chosen=tmp;
                    }
                    
        }
     }
        return chosen;

    }

}
