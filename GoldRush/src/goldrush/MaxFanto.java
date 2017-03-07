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
 * @author Bonati Lorenzo 430490 - Fanto Massimilaino 429845
 */
public class MaxFanto extends GoldDigger{
    int valore;

    public MaxFanto() {
        
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        return valore;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        int massimo = diggers[0];
        int indice = 0;
        for(int i = 0; i < diggers.length; i++) {
            if(diggers[i] > massimo ) {
            massimo = diggers[i];
            indice = i;
            }
        }
        diggers[indice] = 0;
        
        for(int i = 0; i < diggers.length; i++) {
            if(diggers[i] > massimo ) {
            massimo = diggers[i];
            indice = i;
            }
        }
        valore = indice;
        
    }  
    
    
}
