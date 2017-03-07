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
 * @author cl427176
 */
public class MyDigger extends GoldDigger{

    private int index;

    public MyDigger() {
        index = 0;
    }
    
    
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return index;
    }
       
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        //super.dailyOutcome(revenue, distances, diggers);
        int max = 0;
        int index = 0;
        for (int i = 0; i < diggers.length; i++) {
            if(diggers[i]>max){
                max = diggers[i];
                index = i;
            }
        }
        
        this.index = index;
    }   
}
