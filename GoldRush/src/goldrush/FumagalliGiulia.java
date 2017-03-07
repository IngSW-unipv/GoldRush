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
    int place, days, diggers[];
    
    FumagalliGiulia(){
        days = 0;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.diggers = diggers;
        System.out.println(place + " - " + diggers[place]);
    }
    
    @Override
    public int chooseDiggingSite(int[] distances){
        if(days > 0){
            for(int i = distances.length - 1; i >= 0 ; i --){
                if(diggers[i]<5){
                    place = i;
                }
            }
        } else {
            place = new RandomDigger().chooseDiggingSite(distances);
        }
        
        days++;
        return place;
    }
}
