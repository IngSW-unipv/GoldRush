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
 * @author cl427176
 */
public class MyDigger extends GoldDigger{

    private int index;

    public MyDigger() {
        index = 0;
    }
    
    
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return index;
    }
       
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        //super.dailyOutcome(revenue, distances, diggers);
        double maxRapporto = 0;
        int index = 0;
        double rapporto = 0;
        
        for (int i = 0; i < diggers.length; i++) {
            rapporto = diggers[i]/distances[i]*revenue;
            if(rapporto > maxRapporto){
                maxRapporto = rapporto;
                index = i;
            }
        }
        
        this.index = index;
    }   
}
