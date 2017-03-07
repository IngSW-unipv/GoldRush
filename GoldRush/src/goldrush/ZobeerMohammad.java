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
 * @author cl427490
 */
public class ZobeerMohammad extends GoldDigger{
    int day;
    int scelta = 0;
    int revPass;
     int[] punti = {0,0,0,0,0,0};
        
        
    public ZobeerMohammad() {
        day=0; 
    }

    
   
    @Override
    public int chooseDiggingSite(int[] distances) {
        //in collaborazione
       
        
        
        return new AndreaRossi().chooseDiggingSite(distances);
        
    }
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
      
    }
    
   
}
