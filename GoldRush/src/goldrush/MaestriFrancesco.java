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
 * @author cl428055
 */
public class MaestriFrancesco extends GoldDigger{
    
    private int dist[] = new int[6];
    
    private int dig[] = new int[6];
    
    private int rev;
    
    private int day = 0;
    
    public MaestriFrancesco(){
        
        
        
    }
    
    @Override
    public int chooseDiggingSite(int[] distances){
        
       int bufferRev = rev,index = 0;
       
       if(day != 0){
       
        for(int i=0; i<6;i++){
            
            int tot = 5*(12-(2*dist[i]/60))/dig[i];
            
            if(bufferRev < tot){
                
                bufferRev = tot;
                
                index = i;
                
            }
            
        }
        
       }
       
       day++;
       
       return index;
        
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 

        rev = revenue;
        
        dist = distances;
        
        dig = diggers;
        
    }
    
}
