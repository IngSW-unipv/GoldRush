/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import static goldrush.GoldRush.DEFAULT_DAYS;

/**
 *
 * @author Elisa Chiapponi(426982), 
 */
public class ChiapponiElisa extends GoldDigger{

    private int choosenSite;
        

    public ChiapponiElisa(){
        this.choosenSite=0;
        
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return choosenSite;
    }
    
    
}
