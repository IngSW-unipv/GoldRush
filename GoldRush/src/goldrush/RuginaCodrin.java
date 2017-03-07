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
 * @author cl418205
 */
public class RuginaCodrin extends GoldDigger {
    
    private int choosenSite;
    
    public RuginaCodrin(){
        this.choosenSite = 3;
    }
     
    @Override
    public int chooseDiggingSite(int[] distances) {
        return 3;
    }
}