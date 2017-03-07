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
 * @author cl426899 
 * LICCHELLO ANTONIO 426899
 * DI GAETANO MATTEO 427112
 */
public class LicchelloAntonio extends GoldDigger{
    int index;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return index;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        super.dailyOutcome(revenue, distances, diggers); //To change body of generated methods, choose Tools | Templates.
                
        double [] g = new double[distances.length];
        int [] duggers = new int[distances.length];
        
        for (int j = 0; j < distances.length; j++) {
            if(diggers[j] != 0)
                g[j] = ((5*(12-(2*((distances[j])/60))))/diggers[j]);
            else
                g[j] = 0;
        }
        
//        double max = 0;
//        int t = 0;
        
//        for (int k = 0; k < duggers.length; k++) {
//            if(g[k] > max){
//                max = g[k];
//                t = k;
//            }
//        }
//        this.index = t - 2;
        
        double max = 0;
        int t = 0;
        int t1 = 0;
        int t2 = 0;
        
        for (int k = 0; k < duggers.length; k++) {
            if(g[k] > max){
                max = g[k];
                t = k;
                if(max >t1 && max < t){
                    t1 = k;
                    if(max >t2 && max < t1){
                    t2 = k;
                    }
                }
                
            }
        }
        this.index = t2;                                                                                                                                                                                                      
    }    
}
 