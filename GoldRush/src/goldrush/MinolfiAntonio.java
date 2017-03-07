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
 * @author Antonio Minolfi
 * mat 426778
 *  
 */
public class MinolfiAntonio extends GoldDigger{

    int sito;
    
    MinolfiAntonio() {
        sito = 2;
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        int chosen = sito;
        sito++;
        if(sito>4){
            sito = 2;
        }
        return chosen;
    }
    
}
