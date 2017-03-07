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
        int[] revenues = new int[6];
        for (int i = 0; i < revenues.length; i++) {
            int num = 5 * (12*60 - distances[i] * 2);
            int den = diggers[i] * 60;
            int somma =  (num + (den / 2)) / den;
        }
        
        int massimo = revenues[0];
        int indice = 0;
        for(int i = 0; i < revenues.length; i++) {
            if(revenues[i] > massimo ) {
            massimo = revenues[i];
            indice = i;
            }
        }
        revenues[indice] = 0;
        
        for(int i = 0; i < revenues.length; i++) {
            if(revenues[i] > massimo ) {
            massimo = revenues[i];
            indice = i;
            }
        }
        valore = indice;
        
        
        
    }
    
    
}
