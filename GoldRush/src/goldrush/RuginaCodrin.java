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
 * @author cl418205
 */
public class RuginaCodrin extends GoldDigger{
    protected int choice;       //in distanza
    
    public RuginaCodrin() {
        choice = 0;
        
    }
    @Override
    public int chooseDiggingSite(int[]distance) {           //scelgo distana min
        for (int i = 0; i <distance.length; i++) {
            if (distance[i] == choice) {
                return i;
            }
        }
        return 0;
        
    }
    @Override 
    public void dailyOutcome(int revenue, int[] distance, int[] diggers) {
        int max_revenue = 0;
        for (int i = 0; i < distance.length; i++ ) {
           if (getRevenue(distance[i], diggers[i]) > max_revenue) {         //in base al guadagno maggiore
               max_revenue = getRevenue(distance[i], diggers [i]);          //del gg prima
               choice = distance[i];
           } 
        }
    }
     protected int getRevenue(int distance, int diggers) {
         int result = 5*(12-(2*distance/60));
         result = result/(diggers+1);
         return result;
     }
}
