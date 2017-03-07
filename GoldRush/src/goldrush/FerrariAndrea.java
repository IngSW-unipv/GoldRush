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
 * @author cl418849 Federico Draghi
 * @author cl427358 Andrea Ferrari
 */
public class FerrariAndrea extends GoldDigger{
    int revenue;
    int[] distances; 
    int[] diggers;
    boolean primoGiro=true;
    int lastSite;

    @Override
    public int chooseDiggingSite(int[] distances) {
        if(primoGiro==true){
            primoGiro=false;
            lastSite=3;
            return 3;
        }
        
        //CI DA L'INDICE DELLA PIÙ REMUNERATIVA DELLA VOLTA PRECEDENTE
        int revenues[]=new int [distances.length];
        for (int i = 0; i < distances.length; i++) {
            revenues[i]=Town.computeSiteRevenue(distances[i], diggers[i]);
        }
        int maxRevenue=0;
        int imaxRevenue=0;
        for (int i = 0; i < distances.length; i++) {
            if(maxRevenue<revenues[i]){
                imaxRevenue=i;
                maxRevenue=revenues[i];
            }
        }
        
        
        //CONVIENE ANDARE NELLA PIÙ REMUNERATIVA DELLA VOLTA PRECEDENTE?
        int maxRevenue_withMe=Town.computeSiteRevenue(distances[imaxRevenue], diggers[imaxRevenue]+1);
        if(maxRevenue_withMe>revenue){
            lastSite=imaxRevenue;
            return imaxRevenue;
        } else
            return lastSite;
        
     
        
        
    
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.revenue=revenue;
        this.distances=distances.clone();
        this.diggers=diggers.clone();
    }
}
