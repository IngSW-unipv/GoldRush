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
 * 
 * programmatore 1: Filippo Mandrini - matricola: 427012
 * programmatore 2: Samuele Colmi - matricola: 427886
 * 
 */
public class MandriniFilippo extends GoldDigger {
    
    //Random randomGenerator;
    
    private int a;
    
    public MandriniFilippo() {
        //this.randomGenerator = new Random();
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        
        return a;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        int m = 0;
        for(int i = 0; i < 3; i++) {
            if(diggers[i + 1] < diggers[i]) {
                m = i + 1;
            }
        }
        this.a = m;
    }  
}