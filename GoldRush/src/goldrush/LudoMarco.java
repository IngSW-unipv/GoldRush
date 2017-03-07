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
    int chosen;
    int[] distances;
    int[] diggers;
    int revenue;
    int s;

    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.distances = distances;
        this.diggers = diggers;
        this.revenue = revenue;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        if (revenue == 0) {
            chosen = randomGenerator.nextInt(distances.length);
            s=chosen;
        }
       if(revenue >= 1) {
            if (revenue <= 40) {
                s = 3;
            }
            
            if(diggers[1] > diggers[0])
                s=2;
            else
                s=1;
             if(diggers[2] > diggers[1])
                s=3;
            else
                s=0;
              if(diggers[3] > diggers[2])
                s=2;
            else
                s=2;
               if(diggers[4] > diggers[3])
                s=1;
            else
                s=2;
                if(diggers[5] > diggers[4])
                s=0;
            else
                s=2;
        }
        return s;
    }
}
