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
 * @author cl427358
 */
public class DumbDigger extends GoldDigger{
    int revenue;
    int[] distances; 
    int[] diggers;
    boolean primoGiro=true;

    @Override
    public int chooseDiggingSite(int[] distances) {
        if(primoGiro==true){
            primoGiro=false;
            return 3;
        }
        
        //CI DA L'INDICE DELLA PIÙ REMUNERATIVA DELLA VOLTA PRECEDENTE
        int revenues[]=new int [distances.length];
        for (int i = 0; i < distances.length; i++) {
            revenues[i]=5*((12-2*distances[i]/60)/(diggers[i]));
        }
        int maxRevenue=0;
        int imaxRevenue=0;
        for (int i = 0; i < distances.length; i++) {
            if(maxRevenue<revenues[i]){
                imaxRevenue=i;
                maxRevenue=revenues[i];
            }
        }
        
        //CI DA L'INDICE DELLA MENO POPOLATA DELLA VOLTA PRECEDENTE
        /*int minDigger=99;
        int iMinDigger=0;
        for (int i = 0; i < distances.length; i++) {
            if(minDigger>diggers[i]){
                iMinDigger=i;
                minDigger=diggers[i];
            }
        }*/
        
        
        return imaxRevenue;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        this.revenue=revenue;
        this.distances=distances;
        this.diggers=diggers;
    }
}
