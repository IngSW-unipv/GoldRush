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
 * @author cl428055
 */
public class MaestriFrancesco extends GoldDigger{
    
    private int dist[] = new int[6];
    
    private int dig[] = new int[6];
    
    private int tot[] = new int[6];
    
    private int sortedTot[] = new int[6];
    
    private int dgg = 1;
    
    private int rev;
    
    private int day = 2;
    
    public int[] calcolaCacca(int dist[],int dig[]){
        
        int[] bufferTot = new int[6];
        
        for(int i = 0; i < 6; i++){
            
            if(dig[i] == 0){
                
                bufferTot[i] = 0;
                
            }
            
            else{
                
                dgg = dig[i];
                
                bufferTot[i] = 5*(12-(2*dist[i]/60))/dgg;
                
            }
            
        }
        
        return bufferTot;
        
    }
    
    @Override
    public int chooseDiggingSite(int[] distances){
        
       int bufferRev = rev,index = 0;
       
       if(day != 0){
       
        tot = calcolaCacca(dist,dig);
        
        sortedTot = calcolaCacca(dist,dig);
        
        Arrays.sort(sortedTot);
        
        for(int i = 0; i <dist.length;i++){
            
            if(sortedTot[1] == tot[i]){
                
                return i;
                
            }
            
        }
        
       }
       
       day++;
       
       return new RandomDigger().chooseDiggingSite(distances);
        
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 

        rev = revenue;
        
        dist = distances;
        
        dig = diggers;
        
    }
    
}
