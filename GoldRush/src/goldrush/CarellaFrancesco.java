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
 * @author cl418340
 */
public class CarellaFrancesco extends GoldDigger{

    private String cognomeNome; // Carella Francesco matricola:418340

    
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        int i;
        int x = 0;
        int punti = 0;
     
        for(i=0; i < distances.length; i++) {
            if(x > distances[i]) {
                x = distances[i];
                punti = i;
            }
         
        }
        return punti;
    }
    
    
}
