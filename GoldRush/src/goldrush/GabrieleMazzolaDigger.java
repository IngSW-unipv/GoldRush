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
 * @author Gabriele
 */
public class GabrieleMazzolaDigger extends GoldDigger {

    int potato = 9999;
    
    
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        //nemmeno qui puoi copiare, sorry 
        return eheh();//new RandomDigger().chooseDiggingSite(distances); 
        //###################################################
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        
        int potato = this.RandomMethod();
        int nDig = diggers[0];
        
        for(int i = 1; i<distances.length;i++){
            if(diggers[i] < diggers[0]){
                nDig = diggers[i];
                potato = i;
            }
        }
        
        this.potato = potato-1;
    }

    private int eheh() {
        return dontKnowMethod();
    }

    private int dontKnowMethod() {
        int[] prova = null;
        return( (prova == null)? 4:1 );
    }
    
    public static int RandomMethod(){
        return ((1 == 2)? 5 : 1);
    }
    
}
