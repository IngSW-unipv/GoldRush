/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Random;

/**
 *
 * @author cl427012
 */
public class MandriniFilippo extends GoldDigger {
    
    //programmatore 1: Filippo Mandrini - matricola: 427012 - programmatori: Filippo Mandrini e Samuele Colmi
    
    Random randomGenerator;
    //private int i;
    
    public MandriniFilippo() {
        this.randomGenerator = new Random();
    }
    

    @Override
    public int chooseDiggingSite(int[] distances) {
        return randomGenerator.nextInt(distances.length);
        
        
    }  
}
