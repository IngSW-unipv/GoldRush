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
 * @author cl418743
 */
public class RoglediRiccardi extends GoldDigger{
    private String namesurname;     //Rogledi 418743 Riccardi 418760
    

    @Override
    public int chooseDiggingSite(int[] distances) {
        int i;
        int x=0;
        int ris=1;
        for(i=0; i< distances.length; i++){
            if(x>distances[i]){
                x=distances[i];
                ris=i;
            }
        }
        return ris;
    }
    
    
    
}