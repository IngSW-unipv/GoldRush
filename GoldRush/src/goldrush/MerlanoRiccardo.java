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
 * @author Merlano Riccardo 427720
 */
public class MerlanoRiccardo extends GoldDigger {
    
    int sito=0, i=0;

    @Override
    public int chooseDiggingSite(int[] distances) {
        
        if(!(i>1))
            sito=i;
        else
        {
            i=0;
            sito=i;
        }
        
        i++;
        
        return sito;
    }
    
}
