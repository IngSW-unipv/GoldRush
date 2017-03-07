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
 * @author Margherita
 */
public class AnonymousDigger extends GoldDigger {
    
    
    public int scelta;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
     
        int j=0;
        
        if(j==0) {
        
            j++;
            return 1;
            
        }
        
        else {
            
            j=0;
            return 6;
        }   

    }
    
    @Override 
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
       
     /////   
        
    }
    
}
