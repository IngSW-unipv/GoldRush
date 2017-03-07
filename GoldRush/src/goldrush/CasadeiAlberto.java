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
 * @author ilcasa
 */
public class CasadeiAlberto extends GoldDigger{ //casadei alberto, margherita ricotti 428115, 
    private int scelta=1;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
     
        return 1;

    }
    
    @Override 
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        
        int max=0;
        int m=0;
        int totale=0;
        int guadagni[] = new int[6];
        for(int i =0; i<distances.length; i++){
          if(diggers[i]!=0) {
          
            guadagni[i] = 5*((12-(2*distances[i])/60)/2); 
            totale += guadagni[i];
            m++;
          }
        }
        int media = totale/m;

        for(int i =0; i<distances.length; i++){
            if(guadagni[i]>max){
                max=guadagni[i];
            }
        }
        if((revenue<media)){  //&&(revenue!=max)
            int j=0;
            while(guadagni[j]!=max){
                j++;
            }
          
                this.scelta=j;
            
        }
    }
}
