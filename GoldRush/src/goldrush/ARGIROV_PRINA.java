/*
 I migliori!
Marco Prina(418308) e Argirov Lyubomir(420038)
 */
package goldrush;

import java.util.Random;

/**
 *
 * @author cl420038
 */
public class ARGIROV_PRINA extends GoldDigger {
    private int gruppo=2;
    private int guadagnoxsito[]= new int[10];
    private int max=999, maxi=0;

    @Override
    public int chooseDiggingSite(int[] distances) {

        return maxi;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        for(int i=0; i<distances.length ; i++){
            if(diggers[i]==0){
                diggers[i]=1;
            }
                guadagnoxsito[i]=5*((12-2*distances[i]/60)/diggers[i]);
            
        }
        
        for(int i=0; i<distances.length ; i++)
            if(max>guadagnoxsito[i]){
                max=guadagnoxsito[i];
                maxi=i;
            }
       
    }
}
