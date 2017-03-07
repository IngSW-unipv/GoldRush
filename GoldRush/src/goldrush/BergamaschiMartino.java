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
 * @author cl417911
 */
public class BergamaschiMartino extends GoldDigger {
    /* bergamaschi martino 419084
       barattini daniel 417911    
    */
    
    BergamaschiMartino() {

    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        // Each site has the same chance of being chosen independently on its distance.
        return 1;
    }
    
    private int randomChoice() {
        
        double value = Math.random();
        if(value < 0.05)
            return 5;
        else if(value < 0.10)
            return 4;
        else if(value < 0.15)
            return 3;
        else if(value < 0.50)
            return 2;
        else if(value < 0.90)
            return 1;
        else
            return 0;
    }
}