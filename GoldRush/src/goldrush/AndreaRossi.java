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
 * @author cl427121 in stretta collaborazione con 427700 e 427490
 */
public class AndreaRossi extends GoldDigger {
    int[] distances = null;
    int[] diggers = null;
    double stime [];

    @Override
    public int chooseDiggingSite(int[] distances) {
        return 5;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.diggers = diggers;
        this.distances = distances;
    }
    
    private int bestSite(int[] distances, int[] diggers){
        
        double max=0;
        int i_max=0;
        
        for(int i=0; i<diggers.length; i++){
           stime[i]= Town.computeSiteRevenue(distances[i], diggers[i]+1);                       
        }
        for(int i=0; i<diggers.length; i++){
            if(max<stime[i]){
                max=stime[i];
                i_max=i;
            }
        }
        return i_max;
    }
    
    
}