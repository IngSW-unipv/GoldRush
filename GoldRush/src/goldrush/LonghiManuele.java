/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Arrays;

/**
 *
 * @author cl427069
 */
public class LonghiManuele extends GoldDigger{
    
    private int[] gains;
    
    @Override
    public int chooseDiggingSite(int[] dist) {
        
        return getMinIndex(dist);
//        if(gains != null) return getMaxIndex(gains);
//        else return 0;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        
        gains = new int[distances.length];
        
        for(int i = 0; i < distances.length; i++)
            gains[i] = formula(distances[i], diggers[i]);
    }
    
    private int formula(int dis, int nDig) {
        
        if(nDig != 0) return 5*(12-dis/30)/nDig;
        else return 0;
    }
    
    private int getMaxIndex(int[] arr) {
        
        int max = arr[0], index = 0;
        
        for(int i = 0; i < arr.length; i++) if(arr[i] > max) {
            
            max = arr[i];
            index = i;
        }
        
        return index;
    }
    
    private int getMinIndex(int[] arr) {
        
        int min = arr[0], index = 0;
        
        for(int i = 0; i < arr.length; i++) if(arr[i] < min) {
            
            min = arr[i];
            index = i;
        }
        
        return index;
    }
}
