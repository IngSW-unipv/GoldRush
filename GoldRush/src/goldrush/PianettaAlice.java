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
 * @author Alice Pianetta 427611, Matteo Casarini 427550
 */
public class PianettaAlice extends GoldDigger {
    int numSito = 2;
    @Override
    public int chooseDiggingSite(int[] distances) {

        return numSito;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        int min=1000;
        for(int i=0;i<diggers.length;i++){
            if(diggers[i]<min)
                min=diggers[i];
                numSito=i;                 
        }
       
        if(numSito-2>=0){
             numSito=numSito-2;
        }
        else{
            numSito=0;
        }
                
               
                
       
        
    }
}
