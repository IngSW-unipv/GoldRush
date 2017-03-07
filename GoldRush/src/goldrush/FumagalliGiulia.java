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
   // int diggers;
  //  Random randomGenerator;
    
    FumagalliGiulia(){
    //    randomGenerator = new Random();
        days = 0;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.diggers = diggers;
    }
    
    @Override
    public int chooseDiggingSite(int[] distances){
        int tot = 0, c;
        if(days > 0){
    //        if(diggers > 1){
    //            place = randomGenerator.nextInt(3);
    //        }
            for(int i = 0; i < distances.length; i ++){
                tot += diggers[i];
            }
            c = tot/4;
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
