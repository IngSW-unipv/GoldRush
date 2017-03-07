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
public class CasadeiAlberto extends GoldDigger{ //casadei alberto, 428115
    private int scelta=1;
    int day = 0;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return this.scelta;
    }
    
    @Override 
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        int max = 0;
        int guadagni2[] = new int[6];
        int guadagni1[] = new int[6];
       
        if(day==0){
            this.scelta=2;
        }
        
        if(day==1){
            
            for(int i=0; i<distances.length; i++){
                if(diggers[i]!=0){
                    guadagni1[i] = 5*((12-(distances[i]*2/60))/diggers[i]);
                }else{
                    guadagni1[i] = 5*(12-(distances[i]*2/60));
                }
            }
            for(int i=0; i<distances.length; i++){
                if(guadagni1[i]>max){
                    max=i;
                }
            }
            this.scelta = max;
        }
        
        if(day>1){
            int max1 = -1000;
           
            guadagni2 = guadagni1;
            for(int i=0; i<distances.length; i++){
                if(diggers[i]!=0){
                    guadagni1[i] = 5*((12-(distances[i]*2/60))/diggers[i]);
                }else{
                    guadagni1[i] = 5*(12-(distances[i]*2/60));
                }
            }
            
            for(int i = 0 ; i<4; i++){
                if(guadagni1[i]-guadagni2[i]>max1){
                    max1 = guadagni1[i]-guadagni2[i];
                    
                    this.scelta = i+1;
                }
            }        
        }
    }
        
    }

