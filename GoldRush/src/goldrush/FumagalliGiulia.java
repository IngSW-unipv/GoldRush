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
 * @author cl426792
 */
public class FumagalliGiulia extends GoldDigger {
    int place, days, diggers;
    Random randomGenerator;
    
    FumagalliGiulia(){
        randomGenerator = new Random();
        days = 0;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.diggers = diggers[place];
        System.out.println(place + " - " + revenue + " - " + diggers[place] + " - " + this.diggers);
    }
    
    @Override
    public int chooseDiggingSite(int[] distances){
        int r;
        if(days > 0){
            if(diggers > 1){
                r = randomGenerator.nextInt(2);
                if(place != r){
                    place = r;
                }
            }
        } else {
            place = 0;
        }
        
        days++;
        return place;
    }
}
